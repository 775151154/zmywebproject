package com.leo.testpro.designmode23.c_11����Ϊ��ģʽ.c���״̬.a_����¼ģʽ;

/**
 * ��Ҫ�����ԭʼ��
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
