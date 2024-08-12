package org.weilai.Factory.store;

import java.util.Map;

public interface ICommodity {
    public void sendCommodity(String uid, String commodityId, String bizId, Map<String,String>extMap) throws Exception;
}
