package com.wangchen.design.singleton;

/**
 * 双重校验锁，是对懒汉式单例的改进，但是还是会有问题（需要jdk1.5以上才支持jsr-133内存模型规范）
 */
public class DoubleCheckSingleton {

    private static volatile DoubleCheckSingleton instance = null;

    private DoubleCheckSingleton(){
        //防止反射破坏单例
        if (instance != null){
            throw new RuntimeException("单例已存在！");
        }
    }

    public static DoubleCheckSingleton getInstance(){
        if (instance == null){
            synchronized (DoubleCheckSingleton.class){
                if (instance == null){
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
