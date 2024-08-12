package org.ccsama.Factory.Idcard;

import org.ccsama.Factory.Framework.Product;

public class IDCard extends Product {
    private String  owner;

    private Integer idNum;
    //不加public 外部类不能new 只能使用工厂类
     IDCard(Integer idNum,String owner) {
        System.out.println("自作idcard:"+idNum +"卡:" + owner);
        this.owner = owner;
        this.idNum = idNum;
    }

    @Override
    public void use() {
        System.out.println("使用了idcard:"+idNum+"卡:" + owner );
    }

    public String getOwner() {
        return owner;
    }

    public Integer getIdNum() {
         return idNum;
    }
}
