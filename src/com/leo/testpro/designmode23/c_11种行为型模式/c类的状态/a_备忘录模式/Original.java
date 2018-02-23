package com.leo.testpro.designmode23.c_11种行为型模式.c类的状态.a_备忘录模式;

/**
 * 需要储存的原始类
 *
 * @Author Leo
 * @Date 10:31
 */
public class Original {
    private String value;

    public Original(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Memento createMemento() {
        return new Memento(value);
    }

    public void restoreFromMemenoTo(Memento memento) {
        this.value = memento.getValue();
    }
}
