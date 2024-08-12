package org.ccsama.Adapter.ContractsAdapter;

/**
 * 这个适配器没有使用继承 使用的是委托 就是让别人去调用方法
 */
public class Main {
    public static void main(String[] args) {
        Print print = new PrintBanner("www");
        print.printStrong();
        print.printWeak();
    }
}
