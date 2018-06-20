package com.state;
public class State {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    
    public void online() {
        System.out.println("在线");
    }
    
    public void offline() {
        System.out.println("离线");
    }
    
    public void stealth() {
        System.out.println("隐身");
    }
}
