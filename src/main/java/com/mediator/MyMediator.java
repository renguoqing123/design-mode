package com.mediator;
/**
 * 通过中介实现类来处理两个不同的实例
 * @author rengq 2018年6月20日 上午11:09:13
 */
public class MyMediator implements Mediator{
    
    private User user1;
    private User user2;

    public void createMediator() {
        user1=new UserWork1();
        user2=new UserWork2();
    }

    public void workAll() {
        user1.work();
        user2.work();
    }

}
