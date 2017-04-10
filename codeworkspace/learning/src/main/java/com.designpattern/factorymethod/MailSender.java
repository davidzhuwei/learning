package com.designpattern.factorymethod;

/**
 * Created by wei on 2017/4/10 0010.
 */
public class MailSender implements Sender{

    public void send(){
        System.out.println("this is MailSend");
    }
}
