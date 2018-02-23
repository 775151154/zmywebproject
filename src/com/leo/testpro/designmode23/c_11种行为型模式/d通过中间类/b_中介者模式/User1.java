package com.leo.testpro.designmode23.c_11种行为型模式.d通过中间类.b_中介者模式;

public class User1 extends IUser {
    // 感觉构造函数没什么意义
    public User1(IMediator mediator) {
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println(this.getClass().getSimpleName() + "'s work");
    }
}
