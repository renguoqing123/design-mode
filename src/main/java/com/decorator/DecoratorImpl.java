package com.decorator;
/**
 * 装饰模式(针对一个实现类，在不改变原有的逻辑情况下，通过外部类扩展去实现该方法)
 * @author rengq 2018年6月15日 下午2:35:16
 */
public class DecoratorImpl implements SourceAble {

    private SourceAble sourceAble;
    
    public DecoratorImpl(SourceAble sourceAble) {
        this.sourceAble=sourceAble;
    }
    
    public void method() {
        System.out.println("before decorator!");
        sourceAble.method();
        System.out.println("after decorator!");
    }
    
    public static void main(String[] args) {
        SourceAble sourceAble=new SourceAbleImpl();
        SourceAble s=new DecoratorImpl(sourceAble);
        s.method();
    }

}
