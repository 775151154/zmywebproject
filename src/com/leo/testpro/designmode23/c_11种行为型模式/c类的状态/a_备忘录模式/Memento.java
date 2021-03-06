package com.leo.testpro.designmode23.c_11种行为型模式.c类的状态.a_备忘录模式;

/**
 * 备忘录类
 *
 * @Author Leo
 * @Date 10:32
 */
public class Memento {
    private String value;

    public Memento(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
