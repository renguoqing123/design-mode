package com.adapter;
/**
 * 对象适配器模式
 * @author rengq 2018年6月15日 下午2:10:05
 */
public class D implements A{
    
    private B b;
    
    public D(B b) {
        this.b=b;
    }

    public void method1() {
        b.method1();
    }

    public void method2() {
        System.out.println("this is method2");
    }
    
    public static void main(String[] args) {
        B b=new B();
        A a=new D(b);
        a.method1();
        a.method2();
    }

}
