package com.visitor;
/**
 * 访问者模式
 * @author rengq 2018年6月20日 上午10:38:01
 */
public class Test {
    public static void main(String[] args) {
        Visitor visitor = new MyVisitor();  
        Subject sub = new MySubject();  
        sub.accept(visitor);
    }
}
