package com.leo.testpro.designmode23.c_11����Ϊ��ģʽ.b������֮��.d_����ģʽ;

public class MyReceiver implements IReceiver {

    @Override
    public void afterReceive() {
        System.out.println("Command received!");
        System.out.println("do something!");
    }
}
