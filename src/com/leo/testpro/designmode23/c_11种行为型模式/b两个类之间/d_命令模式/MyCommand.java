package com.leo.testpro.designmode23.c_11种行为型模式.b两个类之间.d_命令模式;

public class MyCommand implements ICommand {
    private IReceiver receiver;

    public MyCommand(IReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void exe() {
        receiver.afterReceive();
    }
}
