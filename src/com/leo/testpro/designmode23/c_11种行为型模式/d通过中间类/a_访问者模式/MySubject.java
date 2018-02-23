package com.leo.testpro.designmode23.c_11����Ϊ��ģʽ.dͨ���м���.a_������ģʽ;

public class MySubject implements ISubject {
    /**
     * ���ܽ�Ҫ�����ʵ�����
     *
     * @param visitor
     */
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    /**
     * �ṩ��Ҫ�����ʵ�����
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
