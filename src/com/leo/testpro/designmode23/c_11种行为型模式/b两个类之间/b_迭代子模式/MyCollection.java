package com.leo.testpro.designmode23.c_11种行为型模式.b两个类之间.b_迭代子模式;

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