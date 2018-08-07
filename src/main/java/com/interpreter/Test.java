package com.interpreter;
/**
 * 解释器模式
 * @author rengq 2018年6月20日 上午11:24:14
 */
public class Test {
    public static void main(String[] args) {
        // 计算9*2/3-2的值
        int result = new Minus().interpret(new Context(new Divide().interpret(new Context(new Plus()  
                .interpret(new Context(9, 2)), 3)),2));  
        System.out.println(result);
    }
}
