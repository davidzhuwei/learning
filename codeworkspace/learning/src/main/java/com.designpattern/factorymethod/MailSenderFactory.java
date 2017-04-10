package com.designpattern.factorymethod;

/**
 * Created by wei on 2017/4/10 0010.
 */
public class MailSenderFactory implements Provider {

    public Sender produce(){
        return new MailSender();
    }
}
