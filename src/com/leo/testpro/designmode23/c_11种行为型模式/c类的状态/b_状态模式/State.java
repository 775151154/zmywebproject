package com.leo.testpro.designmode23.c_11����Ϊ��ģʽ.c���״̬.b_״̬ģʽ;

/**
 * ״̬��
 *
 * @Author Leo
 * @Date 11:02
 */
public class State {
    private String state;

    public State(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void method1() {
        System.out.println("do method1!");
    }

    public void method2() {
        System.out.println("do method2!");
    }
}
