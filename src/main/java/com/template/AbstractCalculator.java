package com.template;
public abstract class AbstractCalculator {
    
    /*主方法*/
    public final int calculate1(int exp,int opt) {
        return calculate(exp,opt);
    }
    
    /*被子类重写的方法*/
    abstract public int calculate(int num1,int num2);
    
}
