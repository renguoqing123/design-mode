package com.facade;
/**
 * 外观模式(通过Computer保证所有的类只有一个实例，降低了类类之间的耦合度，这样就起到了解耦的作用，这，就，是外观模式) 
 * @author rengq 2018年6月15日 下午3:12:24
 */
public class Computer {
    private CPU cpu;
    private Memory memory;
    private Disk disk;
    public Computer() {
        this.cpu=new CPU();
        this.memory=new Memory();
        this.disk=new Disk();
    }
    
    public void startup() {
        System.out.println("start the computer!");
        cpu.startup();
        memory.startup();
        disk.startup();
        System.out.println("start computer finished!");
    }
    
    public void stopup() {
        System.out.println("begin to close the computer!");
        cpu.shutdown();
        memory.shutdown();
        disk.shutdown();
        System.out.println("computer closed!");
    }
    
    public static void main(String[] args) {
        Computer c=new Computer();
        c.startup();
        c.stopup();
    }
}
