package com.bridge;
/**
 * 
 * @author rengq 2018年6月15日 下午3:58:21
 */
public class MyBridge extends Bridge{
    
    public void method() {
        getSource().method();
    }
    
    public static void main(String[] args) {
        Bridge b=new MyBridge();
        Sourceable source1=new SourceSub1();
        b.setSource(source1);
        b.method();
        
        Sourceable source2=new SourceSub2();
        b.setSource(source2);
        b.method();
    }
}
