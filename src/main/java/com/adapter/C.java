package com.adapter;
/**
 * 类适配器模式 
 * @author rengq 2018年6月15日 下午2:11:02
 */
public class C extends B implements A{

    public void method2() {
        System.out.println("this is method2");
    }
    
    public static void main(String[] args) {
       A a=new C();
       a.method1();
       a.method2();
    }
    
}
