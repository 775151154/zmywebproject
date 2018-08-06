package com.leo.test.dongnaoxueyuan.maptest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashMapImpl<K, V> implements IMap<K, V> {
	// 定义默认数组大小
	private static int defaultLenth = 16;

	// 使用数组位置总数
	private int useSize;

	// 扩容标准 usesize/数组长度 > 0.75
	private static double defaultAddSizeFactor = 0.75;

	// 定义Map 骨架之一 数组
	private Entry<K, V>[] table = null;
	
	// 
	private Set<K> keySet = new HashSet<K>();

	public HashMapImpl() {
		this(defaultLenth, defaultAddSizeFactor);
	}

	public HashMapImpl(int length, double defaultAddSizeFactor) {
		if (length < 0) {
			throw new IllegalArgumentException("参数不能为负数" + length);
		}
		if (defaultAddSizeFactor <= 0 || Double.isNaN(defaultAddSizeFactor)) {
			throw new IllegalArgumentException("扩容标准必须是大于0的数字" + defaultAddSizeFactor);
		}
		this.defaultLenth = length;
		this.defaultAddSizeFactor = defaultAddSizeFactor;
		table = new Entry[defaultLenth];
	}

	@Override
	public V put(K k, V v) {
		if (useSize > defaultLenth * defaultAddSizeFactor) {
			up2size();
		}
		int index = getIndex(k, table.length);
		Entry<K, V> entry = table[index];
		if (entry == null) {
			table[index] = new Entry(k, v, null);
			useSize++;
		} else {
			// 如果key已经存在，替换替换原有位置上key对应的value
			if (keySet.contains(k)) {
				table[index] = new Entry(k, v, table[index].next);
			} 
			// 如果不存在挤压上个entry
			else {
				table[index] = new Entry(k, v, entry);
			}
		}
		keySet.add(k);
		return table[index].getValue();
	}

	/**
	 * 通过自身数组长度和key确定存储位置
	 * 
	 * @param k
	 * @param length
	 * @return
	 */
	private int getIndex(K k, int length) {
		// hashcode : 与运算
		int m = length - 1;
		int index = hash(k.hashCode()) & m;
		return index;
	}

	/**
	 * 创建自己的哈希算法
	 * 
	 * @param hashCode
	 * @return
	 */
	private int hash(int hashCode) {
		hashCode = hashCode ^ ((hashCode >>> 20) ^ (hashCode >>> 12));
		return hashCode ^ ((hashCode >>> 7) ^ (hashCode >>> 4));
	}

	// 数组扩容，默认扩容2倍
	private void up2size() {
		Entry<K, V>[] newTable = new Entry[2 * defaultLenth];
		// 老数组里面是有非常多Entry对象，这个对象的位置天女散花存在数组的各个角落， 再次散列到新数组
		againHash(newTable);
	}

	// 存储对象散列到新数组里面
	private void againHash(HashMapImpl<K, V>.Entry<K, V>[] newTable) {
		// 数组里对象封装到list
		List<Entry<K, V>> entryList = new ArrayList<Entry<K, V>>();
		for (int i = 0; i < table.length; i++) {
			if (table[i] == null) {
				continue;
			}
			addEntryToList(table[i], entryList);
		}
		if (entryList.size() > 0) {
			useSize = 0;
			defaultLenth = 2 * defaultLenth;
			table = newTable;
			for (Entry<K, V> entry : entryList) {
				if (entry.next != null) {
					entry.next = null;
				}
				keySet.remove(entry.getKey());
				put(entry.getKey(), entry.getValue());
			}
		}
	}

	/**
	 * 添加所有entry到list
	 * 
	 * @param entry
	 * @param entryList
	 */
	private void addEntryToList(HashMapImpl<K, V>.Entry<K, V> entry, List<HashMapImpl<K, V>.Entry<K, V>> entryList) {
		if (entry.next != null) {
			// 这个entry对象已经形成链表结构
			entryList.add(entry);
			// 递归 添加所有entry
			addEntryToList(entry.next, entryList);
		} else {
			entryList.add(entry);
		}
	}

	@Override
	public V get(K k) {
		int index = getIndex(k, table.length);
		if (table[index] == null) {
			throw new NullPointerException();
		}
		return findValueByEqualKey(k, table[index]);
	}

	private V findValueByEqualKey(K k, HashMapImpl<K, V>.Entry<K, V> entry) {
		if (k == entry.getKey() || k.equals(entry.getKey())) {
			return entry.getValue();
		} else if (entry.next != null) {
			return findValueByEqualKey(k, entry.next);
		}
		return null;
	}

	public int useSize() {
		return useSize;
	}
	
	/**
	 * 得到所有key值
	 * @return
	 */
	@Override
	public Set<K> keySet() {
		return keySet;
	}
	
	@Override
	public int size(){
		return keySet.size();
	}

	class Entry<K, V> implements IMap.Entry<K, V> {
		private K k;
		private V v;
		// 指被this挤压下去的Entry对象
		private Entry<K, V> next;

		public Entry(K k, V v, Entry<K, V> next) {
			this.k = k;
			this.v = v;
			this.next = next;
		}

		@Override
		public K getKey() {
			return k;
		}

		@Override
		public V getValue() {
			return v;
		}

	}
}
