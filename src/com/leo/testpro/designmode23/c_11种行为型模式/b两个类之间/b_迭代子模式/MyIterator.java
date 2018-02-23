package com.leo.testpro.designmode23.c_11����Ϊ��ģʽ.b������֮��.b_������ģʽ;

public class MyIterator implements Iterator {
    private Collection collection;
    private int pos = -1;

    public MyIterator(Collection collection) {
        this.collection = collection;
    }

    @Override
    public Object pervious() {
        if (pos > 0) {
            return collection.get(--pos);
        }
        return null;
    }

    @Override
    public Object next() {
        if (hasNext()) {
            return collection.get(++pos);
        }
        return null;
    }

    @Override
    public boolean hasNext() {
        if (pos < collection.size()) {
            return true;
        }
        return false;
    }

    @Override
    public Object first() {
        pos = 0;
        return collection.get(pos);
    }
}