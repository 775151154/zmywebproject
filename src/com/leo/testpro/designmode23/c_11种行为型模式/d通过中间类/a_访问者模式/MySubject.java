package com.leo.testpro.designmode23.c_11种行为型模式.d通过中间类.a_访问者模式;

public class MySubject implements ISubject {
    /**
     * 接受将要被访问的属性
     *
     * @param visitor
     */
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    /**
     * 提供将要被访问的属性
     *
     * @return
     */
    @Override
    public String getSubject1() {
        return "result1";
    }

    @Override
    public String getSubject2() {
        return "result2";
    }
}
