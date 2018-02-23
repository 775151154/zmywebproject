package com.leo.testpro.designmode23.c_11种行为型模式.b两个类之间.b_迭代子模式;

public interface Iterator {
    /**
     * 前移
     */
    Object pervious();

    /**
     * 后移
     */
    Object next();

    boolean hasNext();

    /**
     * 取得第一个元素
     */
    Object first();
}
