package org.ccsama.Factory.Idcard;

import org.ccsama.Factory.Framework.Factory;
import org.ccsama.Factory.Framework.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IDCardFactory extends Factory {


    private Integer idNum = 1 ;
    private Map<Integer,Product> list = new HashMap<Integer,Product>();


    @Override
    public Product createProduct(String onwer) {

        return new IDCard(idNum,onwer);
    }



    @Override
    public void registerProduct(Product product) {
        list.put(idNum,product);
        idNum++;
    }

    public Map getOwner(){
        return list;
    }
}
