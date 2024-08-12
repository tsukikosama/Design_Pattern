package org.weilai.Factory.store.impl;


import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.weilai.Factory.store.Entity.goods.DeliverReq;
import org.weilai.Factory.store.Entity.goods.GoodsService;
import org.weilai.Factory.store.ICommodity;

import java.util.Map;


public class GoodsCommodityService implements ICommodity {

    private Logger logger =
            LoggerFactory.getLogger(GoodsCommodityService.class);
    private GoodsService goodsService = new GoodsService();

    @Override
    public void sendCommodity(String uid, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        DeliverReq deliverReq = new DeliverReq();
        deliverReq.setUserName(queryUserName(uid));
        deliverReq.setUserPhone(queryUserPhoneNumber(uid));
        deliverReq.setSku(commodityId);
        deliverReq.setOrderId(bizId);
        deliverReq.setConsigneeUserName(extMap.get("consigneeUserName"));

        deliverReq.setConsigneeUserPhone(extMap.get("consigneeUserPhone"));

        deliverReq.setConsigneeUserAddress(extMap.get("consigneeUserAddress"));
        Boolean isSuccess = goodsService.deliverGoods(deliverReq);
        logger.info("请求参数[优惠券] => uId：{} commodityId：{} bizId：{} extMap:{}", uid, commodityId, bizId, JSON.toJSON(extMap));
        logger.info("测试结果[优惠券]：{}", isSuccess);
        if (!isSuccess){
            throw new RuntimeException("实体商品发送失败");
        }

    }
    private String queryUserName(String uId) {
        return "花花";
    }
    private String queryUserPhoneNumber(String uId) {
        return "15200101232";
    }
}
