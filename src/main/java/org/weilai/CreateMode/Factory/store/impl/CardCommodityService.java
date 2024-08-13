package org.weilai.CreateMode.Factory.store.impl;

import lombok.extern.slf4j.Slf4j;
import org.weilai.CreateMode.Factory.store.Entity.card.IQiYiCardService;
import org.weilai.CreateMode.Factory.store.ICommodity;

import java.util.Map;

@Slf4j
public class CardCommodityService implements ICommodity {


    @Override
    public void sendCommodity(String uid, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        IQiYiCardService iQiYiCardService = new IQiYiCardService();
        iQiYiCardService.grantToken(uid,bizId);
    }
}
