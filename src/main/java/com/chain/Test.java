package com.chain;
/**
 * 责任链模式
 * @author rengq 2018年6月19日 下午1:44:45
 */
public class Test {
    public static void main(String[] args) {
        MyHandler h1 = new MyHandler("h1"); 
        MyHandler h2 = new MyHandler("h2");  
        MyHandler h3 = new MyHandler("h3");
        h1.setHandler(h2);  
        h2.setHandler(h3);  
        h1.operator();
    }
}