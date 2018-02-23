package com.leo.testpro.designmode23.c_11种行为型模式.d通过中间类.c_解释器模式;

public class Minus implements Expression {

    @Override
    public int interpret(Context context) {
        return context.getNum1()-context.getNum2();
    }
}