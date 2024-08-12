package org.ccsama.Factory;

import org.ccsama.Factory.Framework.Factory;
import org.ccsama.Factory.Framework.Product;
import org.ccsama.Factory.Idcard.IDCardFactory;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        IDCardFactory factory = new IDCardFactory();
        Product product = factory.create("111");
        product.use();
        Product product1 = factory.create("222");
        product1.use();
        Product product2 = factory.create("333");
        product2.use();



    }
}
