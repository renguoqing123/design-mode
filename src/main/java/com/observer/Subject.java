package com.observer;
/**
 * 主题，针对观察者接口添加某些动作
 * @author rengq 2018年6月19日 上午10:28:43
 */
public interface Subject {
    //添加观察者
    void addObserver(Observer obj);
    //移除观察者
    void deleteObserver(Observer obj);
    //当主题方法改变时,这个方法被调用,通知所有的观察者
    void notifyObserver();
    //对自身操作
    void operation();
}
