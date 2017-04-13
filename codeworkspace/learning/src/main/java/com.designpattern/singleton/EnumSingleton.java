package com.designpattern.singleton;

/**
 * 枚举单例
 * 单例模式约束一个类只能实例化一个对象。
 * 1、 自由序列化；
 2、 保证只有一个实例（即使使用反射机制也无法多次实例化一个枚举量）；
 3、 线程安全；
 * Created by wei on 2017/4/12 0012.
 */
public enum EnumSingleton {
    INSTANCE;

    private EnumSingleton(){}

    public void testSingleton(){
        int i=1;
        System.out.println("this is testSingleton"+i);
        i++;
    }

    public  static void main(String[] args){
        for (int i=0 ;i<=10;i++){
            EnumSingleton.INSTANCE.testSingleton();
        }

    }
}
