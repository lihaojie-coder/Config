package com.example.mybatisplus.study;

//双重校验锁实现对象单例
public class Singleton {
    private volatile static Singleton uniqueInstance;

    private Singleton(){

    }

    public static Singleton getUniqueInstance(){
        if(uniqueInstance == null){
            synchronized (Singleton.class){
                if(uniqueInstance == null){
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
