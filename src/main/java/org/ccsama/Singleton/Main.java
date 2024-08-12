package org.ccsama.Singleton;

/**
 * 单例模式 只能获取以后对象
 */
public class Main {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getSingleton();
        Singleton s2 = Singleton.getSingleton();

        if (s1 == s2){
            System.out.println("是同一个对象");
        }else {
            System.out.println("不是同一个对象");
        }
    }
}
