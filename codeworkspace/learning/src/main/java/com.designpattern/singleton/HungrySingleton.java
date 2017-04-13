package com.designpattern.singleton;

/**
 * 饿汉单例模式
 * Created by wei on 2017/4/12 0012.
 */
public class HungrySingleton {

    public static HungrySingleton instance=new HungrySingleton();

    /**
     * 单例模式使用内部类来维护单例的实现，JVM内部的机制能够保证当一个类被加载的时候，这个类的加载过程是线程互斥的。
     * 这样当我们第一次调用getInstance的时候，JVM能够帮我们保证instance只被创建一次，并且会保证把赋值给instance的内存初始化完毕，
     * 同时该方法也只会在第一次调用的时候使用互斥机制，这样就解决了低性能问题。这样我们暂时总结一个完美的单例模式：
     * @return
     */
    public static HungrySingleton getInstance(){
        return  instance;
    }


}
