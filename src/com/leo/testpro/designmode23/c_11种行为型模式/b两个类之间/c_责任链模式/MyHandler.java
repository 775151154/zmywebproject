package com.leo.testpro.designmode23.c_11种行为型模式.b两个类之间.c_责任链模式;

public class MyHandler extends AbstractHandler implements Handler {
    private String name;

    public MyHandler(String name) {
        this.name = name;
    }

    @Override
    public void operator() {
        System.out.println("MyOperator name is ：" + name);
        if (getHandler() != null) {
            getHandler().operator();
        }
    }
}
