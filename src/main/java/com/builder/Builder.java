package com.builder;
/**
 * 建造者模式
 * @author rengq 2018年6月15日 上午10:51:14
 */
public class Builder {
    private String name;
    private String age;
    private String sex;
    private String address;
    private String phone;
    
    public String getName() {
        return name;
    }
    public Builder setName(String name) {
        this.name = name;
        return this;
    }
    public String getAge() {
        return age;
    }
    public Builder setAge(String age) {
        this.age = age;
        return this;
    }
    public String getSex() {
        return sex;
    }
    public Builder setSex(String sex) {
        this.sex = sex;
        return this;
    }
    public String getAddress() {
        return address;
    }
    public Builder setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getPhone() {
        return phone;
    }
    public Builder setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    
    public Builder execute() {
        System.out.println(getName()+":"+age+":"+sex+":"+address+":"+phone);
        return this;
    }
    
    public static void main(String[] args) {
        new Builder().setName("roy").setAge("18").setSex("M").setAddress("xxoo").setPhone("139****3846").execute();
    }
    
}
