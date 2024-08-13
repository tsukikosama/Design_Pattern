package org.weilai.CreateMode.Single;

/**
 * 这里只记录一种常用的单例模式
 */
public class Signle {

    //使用匿名内部类来创建实力对象
    private static class SingletonHolder {
        private static Signle instance = new Signle();
    }
    /**
     * 空参构造器私有化 让外部不能new这个对象
     */
    private void Single(){

    }

    public static Signle getInstance(){
        return SingletonHolder.instance;
    }
}
