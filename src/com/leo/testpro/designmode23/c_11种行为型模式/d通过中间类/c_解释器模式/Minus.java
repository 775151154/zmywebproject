package com.leo.testpro.designmode23.c_11����Ϊ��ģʽ.dͨ���м���.c_������ģʽ;

public class Minus implements Expression {

    @Override
    public int interpret(Context context) {
        return context.getNum1()-context.getNum2();
    }
}