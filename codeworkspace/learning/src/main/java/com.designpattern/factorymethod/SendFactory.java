package com.designpattern.factorymethod;

/**
 *
 * Created by wei on 2017/4/10 0010.
 */
public class SendFactory {

    /**
     * 1、普通工厂模式，就是建立一个工厂类，对实现了同一接口的一些类进行实例的创建
     * @param type
     * @return
     */
    public Sender product(String type){
        if("mail".equals(type)){
            return new MailSender();
        }else if("sms".equals(type)){
            return new SmsSender();
        }else{
            System.out.print("请输入正确类形!");
            return null;
        }
    }

    public void testProduce(){
        SendFactory sendFactory=new SendFactory();
        Sender mailSend=sendFactory.product("mail");
        mailSend.send();
    }

    /**
     * 2、静态工厂方法模式，将上面的多个工厂方法模式里的方法置为静态的，不需要创建实例，直接调用即可。
     * @return
     */
    public static Sender produceMail(){
        return new MailSender();
    }

    public static Sender produceSms(){
        return new SmsSender();
    }

    public static void main(String[] args){
//        this.testProduce();

        SendFactory.produceMail().send();;
    }
}
