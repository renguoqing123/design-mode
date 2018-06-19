package com.strategy;
public class BussCar extends Car{

    public BussCar(String name, String color) {
        super(name, color);
        // TODO Auto-generated constructor stub
    }

    public void run() {
        System.out.println(color +" " + name  +"在缓慢的行驶。。。");
    }

}
