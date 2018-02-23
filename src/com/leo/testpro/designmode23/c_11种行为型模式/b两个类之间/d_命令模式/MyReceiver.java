package com.leo.testpro.designmode23.c_11种行为型模式.b两个类之间.d_命令模式;

public class MyReceiver implements IReceiver {

    @Override
    public void afterReceive() {
        System.out.println("Command received!");
        System.out.println("do something!");
    }
}
