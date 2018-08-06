package com.leo.test.dongnaoxueyuan.maptest;

import java.util.Set;

public interface IMap<K, V> {
	// map基本功能是 快速存
	public V put(K k, V v);

	// 快速取
	public V get(K k);

	// 所有key值
	public Set<K> keySet();

	public int size();

	public interface Entry<K, V> {
		// map.getKey
		public K getKey();

		public V getValue();
	}
}
