package com.designpattern.factorymethod;

/**
 * Created by wei on 2017/4/10 0010.
 */
public class TestFactory {

    public static void main(String[] args) {
//        this.testProduce();
//        SendFactory.produceMail().send();
        Provider smsSenderFactoryprovider=new MailSenderFactory();
        Sender sender=smsSenderFactoryprovider.produce();
        sender.send();;
    }

    public void testProduce(){
        SendFactory sendFactory=new SendFactory();
        Sender mailSend=sendFactory.product("mail");
        mailSend.send();
    }
}
