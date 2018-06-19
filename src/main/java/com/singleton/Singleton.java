package com.singleton;
/**
 * 单例模式，单例对象保证在JVM中改对象只有一个实例存在。 
 * @author rengq 2018年6月15日 上午10:47:55
 */
public class Singleton {
    
    private static Singleton singleton=null;
    
    private Singleton() {}
    
    public static Singleton getInstance(){
        if(singleton == null) {
            synchronized (singleton) {
                if(singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
