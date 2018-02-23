package com.leo.testpro.designmode23.c_11种行为型模式.b两个类之间.d_命令模式;

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
