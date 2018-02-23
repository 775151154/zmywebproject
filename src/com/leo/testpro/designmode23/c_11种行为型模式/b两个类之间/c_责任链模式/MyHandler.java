package com.leo.testpro.designmode23.c_11����Ϊ��ģʽ.b������֮��.c_������ģʽ;

public class MyHandler extends AbstractHandler implements Handler {
    private String name;

    public MyHandler(String name) {
        this.name = name;
    }

    @Override
    public void operator() {
        System.out.println("MyOperator name is ��" + name);
        if (getHandler() != null) {
            getHandler().operator();
        }
    }
}
