package com.strategy;

public class Car implements CarFunction {
    
    protected String    name;       //车名字
    protected String    color;      //车颜色
    private CarFunction carFunction;//策略类

    public Car(String name,String color) {
        this.name=name;
        this.color=color;
    }
    
    public void run() {
        System.out.println(color +" " + name  +"在行驶。。。");
    }

}
