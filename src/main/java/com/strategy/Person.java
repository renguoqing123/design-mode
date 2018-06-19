package com.strategy;
public class Person {
    private String name;    //姓名
    private Integer age;    //年龄
    private Car car;        //拥有车
       
    public void driver(Car car){
           System.out.print(name +"  "+ age+" 岁 "+" 开着");
           car.run();
        }
    
    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
