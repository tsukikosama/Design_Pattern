package org.ccsama.Adapter.ExtendAdapter;

/**
 * 继承实现的修饰器模式 可以让用户不用直接使用实现类 不用关心是怎么实现的 如果需要新的实现 只要在抽象类中添加新的方法
 */
public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("hello");

        p.printStrong();
        p.printWeak();
        p.printStra();
    }
}
