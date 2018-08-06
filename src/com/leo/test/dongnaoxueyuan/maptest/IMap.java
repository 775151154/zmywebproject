package com.leo.test.dongnaoxueyuan.maptest;

import java.util.Set;

public interface IMap<K, V> {
	// map���������� ���ٴ�
	public V put(K k, V v);

	// ����ȡ
	public V get(K k);

	// ����keyֵ
	public Set<K> keySet();

	public int size();

	public interface Entry<K, V> {
		// map.getKey
		public K getKey();

		public V getValue();
	}
}
