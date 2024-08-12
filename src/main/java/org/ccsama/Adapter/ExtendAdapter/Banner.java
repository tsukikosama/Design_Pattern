package org.ccsama.Adapter.ExtendAdapter;

public class Banner {
    private String str;

    public Banner(String str) {
        this.str = str;
    }

    public void showWithParen(){
        System.out.println("(" + str + ")");
    }

    public void showWithAster(){
        System.out.println("*" + str + "*");
    }

    public void showWithStar(){
        System.out.println("☆" + str + "☆");
    }
}
