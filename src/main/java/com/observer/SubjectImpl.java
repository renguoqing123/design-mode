package com.observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Subject接口实现类
 * @author rengq 2018年6月19日 上午10:30:52
 */
public abstract class SubjectImpl implements Subject {
    
    //声明一个观察者的集合类
    private Vector<Observer> vector = new Vector<Observer>();

    public void addObserver(Observer obj) {
        vector.add(obj);
    }

    public void deleteObserver(Observer obj) {
        vector.remove(obj);
    }

    public void notifyObserver() {
        Enumeration<Observer> enumo = vector.elements();  
        while(enumo.hasMoreElements()){  
            enumo.nextElement().update();  
        }  
    }

}
