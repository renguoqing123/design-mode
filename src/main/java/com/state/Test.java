package com.state;
public class Test {
    public static void main(String[] args) {
        State state=new State();
        state.setValue("1");
        Context context=new Context(state);
        context.method();
    }
}
