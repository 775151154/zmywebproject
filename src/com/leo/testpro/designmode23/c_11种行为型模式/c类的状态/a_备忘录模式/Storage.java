package com.leo.testpro.designmode23.c_11种行为型模式.c类的状态.a_备忘录模式;

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
