package com.template;
/**
 * 模板方法模式
 * @author rengq 2018年6月19日 上午10:18:12
 */
public class Plus extends AbstractCalculator{

    @Override
    public int calculate(int num1, int num2) {
        return num1+num2;
    }

    
    public static void main(String[] args) {  
        int exp = 8;  
        int exp1 = 8;
        AbstractCalculator cal = new Plus();  
        int result = cal.calculate1(exp, exp1);  
        System.out.println(result);  
    }  
}
