package com.leo.testpro.designmode23.c_11����Ϊ��ģʽ.b������֮��.d_����ģʽ;

public class MyInvoker implements IInvoker {
    private ICommand command;

    public MyInvoker(ICommand command) {
        this.command = command;
    }

    @Override
    public void action() {
        command.exe();
    }
}
