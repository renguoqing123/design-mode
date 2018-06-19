package com.observer;
/**
 * 观察者模式
 * @author rengq 2018年6月19日 上午10:52:47
 */
public class MySubject extends SubjectImpl{
    
    public void operation() {
        System.out.println("update self!");
        notifyObserver();//通知所有
    }
    
    public static void main(String[] args) {
        Subject sub=new MySubject();
        sub.addObserver(new Observer1());
        sub.addObserver(new Observer2());
        //sub.deleteObserver(new Observer2());
        sub.operation();
    }

}
