package com.leo.testpro.designmode23.c_11种行为型模式.b两个类之间.c_责任链模式;

public class AbstractHandler {
    private Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
}
