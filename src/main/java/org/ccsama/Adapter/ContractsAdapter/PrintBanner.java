package org.ccsama.Adapter.ContractsAdapter;

/**
 * 委托别人去使用方法
 */
public class PrintBanner extends Print{

    private Banner banner;

    public PrintBanner(String str) {
        this.banner = new Banner(str);
    }

    @Override
    public void printWeak(){
        banner.showWithAster();
    }

    @Override
    public void printStrong(){
        banner.showWithParen();
    }
}
