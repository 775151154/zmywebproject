package com.leo.testpro.designmode23.c_11����Ϊ��ģʽ.b������֮��.d_����ģʽ;

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
