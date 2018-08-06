package com.leo.test.dongnaoxueyuan.maptest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashMapImpl<K, V> implements IMap<K, V> {
	// ����Ĭ�������С
	private static int defaultLenth = 16;

	// ʹ������λ������
	private int useSize;

	// ���ݱ�׼ usesize/���鳤�� > 0.75
	private static double defaultAddSizeFactor = 0.75;

	// ����Map �Ǽ�֮һ ����
	private Entry<K, V>[] table = null;
	
	// 
	private Set<K> keySet = new HashSet<K>();

	public HashMapImpl() {
		this(defaultLenth, defaultAddSizeFactor);
	}

	public HashMapImpl(int length, double defaultAddSizeFactor) {
		if (length < 0) {
			throw new IllegalArgumentException("��������Ϊ����" + length);
		}
		if (defaultAddSizeFactor <= 0 || Double.isNaN(defaultAddSizeFactor)) {
			throw new IllegalArgumentException("���ݱ�׼�����Ǵ���0������" + defaultAddSizeFactor);
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
			// ���key�Ѿ����ڣ��滻�滻ԭ��λ����key��Ӧ��value
			if (keySet.contains(k)) {
				table[index] = new Entry(k, v, table[index].next);
			} 
			// ��������ڼ�ѹ�ϸ�entry
			else {
				table[index] = new Entry(k, v, entry);
			}
		}
		keySet.add(k);
		return table[index].getValue();
	}

	/**
	 * ͨ���������鳤�Ⱥ�keyȷ���洢λ��
	 * 
	 * @param k
	 * @param length
	 * @return
	 */
	private int getIndex(K k, int length) {
		// hashcode : ������
		int m = length - 1;
		int index = hash(k.hashCode()) & m;
		return index;
	}

	/**
	 * �����Լ��Ĺ�ϣ�㷨
	 * 
	 * @param hashCode
	 * @return
	 */
	private int hash(int hashCode) {
		hashCode = hashCode ^ ((hashCode >>> 20) ^ (hashCode >>> 12));
		return hashCode ^ ((hashCode >>> 7) ^ (hashCode >>> 4));
	}

	// �������ݣ�Ĭ������2��
	private void up2size() {
		Entry<K, V>[] newTable = new Entry[2 * defaultLenth];
		// �������������зǳ���Entry������������λ����Ůɢ����������ĸ������䣬 �ٴ�ɢ�е�������
		againHash(newTable);
	}

	// �洢����ɢ�е�����������
	private void againHash(HashMapImpl<K, V>.Entry<K, V>[] newTable) {
		// ����������װ��list
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
	 * �������entry��list
	 * 
	 * @param entry
	 * @param entryList
	 */
	private void addEntryToList(HashMapImpl<K, V>.Entry<K, V> entry, List<HashMapImpl<K, V>.Entry<K, V>> entryList) {
		if (entry.next != null) {
			// ���entry�����Ѿ��γ�����ṹ
			entryList.add(entry);
			// �ݹ� �������entry
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
	 * �õ�����keyֵ
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
		// ָ��this��ѹ��ȥ��Entry����
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
