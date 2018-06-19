package com.factory.abstractFactory;

import com.factory.Sender;
import com.factory.SmsSender;

public class SendSmsFactory implements Provider{

    public Sender produce() {
        System.out.println("modify SmsSender");
        return new SmsSender();
    }

}
