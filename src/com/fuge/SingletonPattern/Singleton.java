package com.fuge.SingletonPattern;

/**
 * Created by dongfu on 17-4-14.
 */

//饿汉式单例模式
//class Singleton {
//    private static final Singleton instance = new Singleton();
//
//    private Singleton() {}
//
//    public static Singleton getInstance() {
//        return instance;
//    }
//}


class Singleton {
    private static Singleton instance = null;

    //私有构造方法，防止被实例化
    private Singleton(){}

    //静态工程方法，创建实例
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized(Singleton.class) {
                if (instance == null)
                instance = new Singleton();
            }
        }
        return instance;
    }
}
