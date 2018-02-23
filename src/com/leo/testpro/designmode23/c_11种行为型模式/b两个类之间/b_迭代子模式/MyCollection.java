package com.leo.testpro.designmode23.c_11����Ϊ��ģʽ.b������֮��.b_������ģʽ;

public class MyCollection implements Collection {

    private String[] strArr = {"A", "B", "C", "D", "E"};

//    private Iterator iterator = new MyIterator(this);

    @Override
    public Iterator iterator() {
//        return iterator;
        return new MyIterator(this);

    }

    @Override
    public Object get(int i) {
        return strArr[i];
    }

    @Override
    public int size() {
        return strArr.length;
    }
}