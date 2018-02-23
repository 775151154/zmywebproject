package com.leo.testpro.designmode23.c_11����Ϊ��ģʽ.c���״̬.b_״̬ģʽ;

/**
 * ״̬ģʽ���л���
 *
 * @Author Leo
 * @Date 11:03
 */
public class Context {
    private State state;

    public Context(State state) {
        this.state = state;
    }

    public void afterChangeState() {
        if ("state1".equals(state.getState())) {
            System.out.println("now is " + state.getState());
            state.method1();
        }
        if ("state2".equals(state.getState())) {
            System.out.println("now is " + state.getState());
            state.method2();
        }
    }
}
