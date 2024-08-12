package org.ccsama.Singleton.Practice;

import java.util.ArrayList;
import java.util.List;

public class Triple {
    private static List<Triple> instance = new ArrayList<>();


    public static Triple getInstance(Integer id){
        Triple t = instance.get(id);
        if (t == null){
            System.out.println("该实例不存在");
        }
        return instance.get(id);
    }
    public static Triple getInstance(){
        if (instance.size() < 3){
            Triple t = new Triple();
            instance.add(t);
            return t;
        }else{
            return null;
        }

    }
    public Triple(){
        System.out.println("当前是1");
    }

}
