package com.leo.testpro.designmode23.c_11����Ϊ��ģʽ.dͨ���м���.a_������ģʽ;

public class Visitor1 implements IVisitor {

    @Override
    public void visit(ISubject sub) {
        System.out.println("visit sub : " + sub.getSubject1());
    }
}
