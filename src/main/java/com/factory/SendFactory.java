package com.factory;
public class SendFactory {
    
    //普通工厂模式
    public Sender produce(String type) {
        if(type.equals("mail")) {
            return new MailSender();
        }else if(type.equals("sms")){
            return new SmsSender();
        }else {
            System.out.println("error");
            return null;
        }
    }
    
    
    //多个工厂模式
    public Sender produceMail(){  
        return new MailSender();  
    }  
      
    public Sender produceSms(){  
        return new SmsSender();  
    }  
    
    //静态工厂模式直接在public后面加static
    public static Sender produceMails(){  
        return new MailSender();  
    }  
      
    public static Sender produceSmss(){  
        return new SmsSender();  
    }
    
    public static void main(String[] args) {
        new SendFactory().produce("sms").send();//普通工厂
        new SendFactory().produceMail();//多个工厂
        produceMails();//静态工厂
    }
}
