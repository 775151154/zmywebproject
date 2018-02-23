package com.leo.testpro.designmode23.c_11种行为型模式.d通过中间类.c_解释器模式;

/**
 * 解释器模式是我们暂时的最后一讲，一般主要应用在OOP开发中的编译器的开发中，所以适用面比较窄。
 * <p>
 * 基本就这样，解释器模式用来做各种各样的解释器，如正则表达式等的解释器等等！
 *
 * @Author Leo
 * @Date 2018/2/6 16:33
 */
public class Test {

    public static void main(String[] args) {

        // 计算9+2-8的值
        int result = new Minus().interpret((new Context(new Plus()
                .interpret(new Context(9, 2)), 8)));
        System.out.println(result);
    }
}