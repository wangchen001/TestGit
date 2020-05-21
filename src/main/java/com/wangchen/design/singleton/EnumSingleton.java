package com.wangchen.design.singleton;

public class EnumSingleton {
    /**
     * 用枚举实现单例最简单，因为java中的枚举类型本身就是天然的单例，而且不会被破解
     * 但是枚举有一个不足之处：没法延迟加载
     */
    private EnumSingleton(){

    }

    private enum Singleton{
        INSTANCE;

        private final EnumSingleton instance;

        Singleton(){
            instance = new EnumSingleton();
        }

        private EnumSingleton getInstance(){
            return instance;
        }
    }

    public static EnumSingleton getInstance(){
        return Singleton.INSTANCE.getInstance();
    }
}
