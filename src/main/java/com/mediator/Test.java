package com.mediator;
/**
 * 中介者模式
 * @author rengq 2018年6月20日 上午11:08:24
 */
public class Test {
    public static void main(String[] args) {
        Mediator mediator=new MyMediator();
        mediator.createMediator();
        mediator.workAll();
    }
}
