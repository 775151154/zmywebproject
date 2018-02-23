package com.leo.testpro.designmode23.c_11����Ϊ��ģʽ.b������֮��.a_�۲���ģʽ;

import java.util.Enumeration;
import java.util.Vector;

public abstract class AbstractSubject implements ISubject {

    private Vector<IObserver> observers = new Vector<IObserver>();

    @Override
    public void add(IObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void del(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        Enumeration<IObserver> enumo = observers.elements();
        while (enumo.hasMoreElements()) {
            enumo.nextElement().update();
        }
    }

}
