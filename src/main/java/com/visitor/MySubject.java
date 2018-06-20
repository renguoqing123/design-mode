package com.visitor;
public class MySubject implements Subject{

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getSubject() {
        return "OK";
    }

}
