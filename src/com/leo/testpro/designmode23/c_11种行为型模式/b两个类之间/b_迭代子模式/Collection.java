package com.leo.testpro.designmode23.c_11种行为型模式.b两个类之间.b_迭代子模式;

public interface Collection {
    public Iterator iterator();

    /*取得集合元素*/
    public Object get(int i);

    /*取得集合大小*/
    public int size();
}
