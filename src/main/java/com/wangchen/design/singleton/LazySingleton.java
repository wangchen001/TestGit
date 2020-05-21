package com.wangchen.design.singleton;

/**
 * 对于单线程来说，懒汉式单例很完美
 * 但是对于多线程场景，两个线程同时到达if表达式处，此时instance对象为null，会创建两个lazySingleton对象
 */
public class LazySingleton {

    private static LazySingleton instance = null;

    private LazySingleton(){
        //防止反射破坏单例
        if (instance != null){
            throw new RuntimeException("单例已存在！");
        }
    }

    public static LazySingleton getInstance(){
        if (instance == null){
            instance =  new LazySingleton();
        }
        return instance;
    }
}
