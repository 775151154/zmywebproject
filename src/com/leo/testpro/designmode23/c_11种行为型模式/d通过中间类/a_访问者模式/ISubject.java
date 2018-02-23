package com.leo.testpro.designmode23.c_11种行为型模式.d通过中间类.a_访问者模式;

public interface ISubject {
    void accept(IVisitor visitor);

    String getSubject1();

    String getSubject2();
}
