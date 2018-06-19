package com.proxy;

import com.decorator.SourceAble;
import com.decorator.SourceAbleImpl;

/**
 * 代理模式(就是采用一个代理类调用原有的方法，且对产生的结果进行控制)
 * @author rengq 2018年6月15日 下午2:56:59
 */
public class Proxy implements SourceAble{
    
    private SourceAbleImpl sourceAbleImpl;
    public Proxy() {
        this.sourceAbleImpl =new SourceAbleImpl();
    }
    
    
    public void method() {
        System.out.println("before proxy!");
        sourceAbleImpl.method();
        System.out.println("after proxy!"); 
    }
    
    public static void main(String[] args) {
        SourceAble s=new Proxy();
        s.method();
    }

}
