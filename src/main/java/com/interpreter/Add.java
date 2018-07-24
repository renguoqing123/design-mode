package com.interpreter;

public class Add implements Expression {

    public int interpret(Context context) {
        return context.getNum1() - context.getNum2();
    }

}
