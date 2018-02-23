package com.leo.testpro.designmode23.c_11种行为型模式.c类的状态.b_状态模式;

/**
 * 状态模式的切换类
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
