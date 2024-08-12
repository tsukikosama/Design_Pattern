package org.ccsama.Adapter.ExtendAdapter;

//实现接口 继承实现类的方法

public class PrintBanner extends Banner implements Print {
    public PrintBanner(String str) {
        super(str);
    }

    @Override
    public void printWeak() {
        showWithAster();
    }

    @Override
    public void printStrong() {
        showWithParen();
    }

    @Override
    public void printStra() {
        showWithStar();
    }
}
