package org.ccsama.Factory.Framework;

/**
 * 创建抽象工程
 */
public abstract class Factory {
    public abstract Product createProduct(String onwer);

    public abstract void registerProduct(Product product);
    public final Product create(String owner){
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }
}
