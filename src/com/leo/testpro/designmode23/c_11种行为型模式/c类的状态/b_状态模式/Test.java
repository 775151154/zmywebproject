package com.leo.testpro.designmode23.c_11种行为型模式.c类的状态.b_状态模式;

/**
 * 核心思想就是：当对象的状态改变时，同时改变其行为，很好理解！就拿QQ来说，有几种状态，在线、隐身、忙碌等，每个状态对应不同的操作，
 * 而且你的好友也能看到你的状态，所以，状态模式就两点：1、可以通过改变状态来获得不同的行为。2、你的好友能同时看到你的变化。
 * <p>
 * 根据这个特性，状态模式在日常开发中用的挺多的，尤其是做网站的时候，我们有时希望根据对象的某一属性，
 * 区别开他们的一些功能，比如说简单的权限控制等。
 *
 * @Author Leo
 * @Date 2018/2/6 11:21
 */
public class Test {
    public static void main(String[] args) {
        State state = new State("state1");
        Context context = new Context(state);
        context.afterChangeState();

        state.setState("state2");
        context.afterChangeState();
    }
}
