package com.command;
public class Invoker {
    
    private Command command;
    
    public Invoker(Command command) {
        this.command=command;
    }
    
    public void action() {
        command.exe();
    }
    
    public void addAction() {
        command.add();
    }
    
    public static void main(String[] args) {
        Receiver receiver=new Receiver();//接受
        Command command=new MyCommand(receiver);//命令
        Invoker invoker=new Invoker(command);//执行
        invoker.action();
        invoker.addAction();
    }
}
