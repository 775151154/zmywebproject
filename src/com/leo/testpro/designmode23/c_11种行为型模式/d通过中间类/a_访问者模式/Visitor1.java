package com.leo.testpro.designmode23.c_11种行为型模式.d通过中间类.a_访问者模式;

public class Visitor1 implements IVisitor {

    @Override
    public void visit(ISubject sub) {
        System.out.println("visit sub : " + sub.getSubject1());
    }
}
