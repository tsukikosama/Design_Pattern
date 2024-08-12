package org.ccsama.Singleton;

public class Singleton {
    public static final Singleton singleton = new Singleton();

    public Singleton() {
        System.out.println("生成了一个单例对象");
    }

    public static Singleton getSingleton(){
        return singleton;
    }
}
