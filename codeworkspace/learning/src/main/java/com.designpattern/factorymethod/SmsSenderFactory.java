package com.designpattern.factorymethod;

/**
 * Created by wei on 2017/4/10 0010.
 */
public class SmsSenderFactory implements Provider {

    public Sender produce(){
        return new SmsSender();
    }
}
