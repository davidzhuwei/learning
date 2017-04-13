package com.designpattern.singleton;

/**
 * 懒汉单例模式
 * Created by wei on 2017/4/12 0012.
 */
public class LazySingleton {

    public static  volatile LazySingleton lazySingleton = null;

    private LazySingleton(){}

    public static LazySingleton getInstance(){
        if(lazySingleton == null){
            synchronized(LazySingleton.class){
                if(lazySingleton == null){
                    lazySingleton =  new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }

}
