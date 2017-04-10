package com.designpattern.factorymethod;

/**
 * Created by wei on 2017/4/10 0010.
 */
public class SmsSender implements Sender{

    public void send(){
        System.out.print("this is SmsSend");
    }
}
