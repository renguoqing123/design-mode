package com.factory.abstractFactory;

import com.factory.MailSender;
import com.factory.Sender;

public class SendMailFactory implements Provider{

    public Sender produce() {
        System.out.println("modify MailSender");
        return new MailSender();
    }

}
