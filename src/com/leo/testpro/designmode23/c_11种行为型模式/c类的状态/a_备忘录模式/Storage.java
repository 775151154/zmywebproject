package com.leo.testpro.designmode23.c_11����Ϊ��ģʽ.c���״̬.a_����¼ģʽ;

public class Storage {
    private Memento memento;

    public Storage(Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }

}
