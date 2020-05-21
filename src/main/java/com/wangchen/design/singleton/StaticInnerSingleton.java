package com.wangchen.design.singleton;

public class StaticInnerSingleton {
    /**
     * 静态内部类式单例，推荐
     */
    private static class StaticInnerSingletonInstance{
        private static final StaticInnerSingleton instance
                = new StaticInnerSingleton();
    }

    private StaticInnerSingleton(){
        //防止反射破坏单例
        if (StaticInnerSingletonInstance.instance != null){
            throw new RuntimeException("单例已存在！");
        }
    }

    public static StaticInnerSingleton getInstance(){
        return StaticInnerSingletonInstance.instance;
    }
}
