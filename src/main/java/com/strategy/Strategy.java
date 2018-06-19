package com.strategy;
/**
 * 策略模式（可以动态的改变对象的行为）
 * @author rengq 2018年6月15日 下午4:21:42
 */
public class Strategy {
    public static void main(String[] args) {
        Car smallCar = new SmallCar("路虎", "黑色");
        Car bussCar = new BussCar("公交车", "白色");
        Person p1 = new Person("小明", 20);
        p1.driver(smallCar);
        p1.driver(bussCar);
    }
}
