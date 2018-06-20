package com.state;
public class Context {
    private State state;
    
    public Context(State state) {
        this.state=state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
    
    public void method() {
        if(state.getValue().equals("1")) {
            state.online();
        }else if(state.getValue().equals("2")) {
            state.offline();
        }else if(state.getValue().equals("3")) {
            state.stealth();
        }else {
            System.out.println("未知");
        }
    }
    
}
