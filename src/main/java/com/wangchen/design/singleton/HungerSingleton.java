package com.wangchen.design.singleton;

/**
 * 饿汉式单例可能会存在几点问题：
 * 1、一旦类初始化就会创建这个对象，如果创建这个对象很耗费时间和资源，会造成巨大的性能损耗
 * 2、如果只是单独的加载这个类，不需要使用该对象，这种模式会浪费内存（不能做到延迟加载）
 * 比如，该对象中存在一个静态属性，外部通过类名.属性名去使用，此时会导致整个类初始化，
 * 导致instance被实例化，造成内存泄漏
 */
public class HungerSingleton {

    private HungerSingleton(){
        //防止反射破坏单例
        if (instance != null){
            throw new RuntimeException("单例已存在！");
        }
    }

    private static HungerSingleton instance = new HungerSingleton();

    public static HungerSingleton getInstance(){
        return instance;
    }
}
