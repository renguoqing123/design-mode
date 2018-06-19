package com.factory.abstractFactory;
public class Test {
    public static void main(String[] args) {
        //抽象工厂模式（针对原来的实现类进行扩展，无需改动现成的代码）
        Provider p=new SendMailFactory();
        p.produce().send();
        p=new SendSmsFactory();
        p.produce().send();
    }
}
