package org.weilai.CreateMode.Factory;

import org.weilai.CreateMode.Factory.store.impl.CardCommodityService;
import org.weilai.CreateMode.Factory.store.impl.CouponCommodityService;
import org.weilai.CreateMode.Factory.store.impl.GoodsCommodityService;
import org.weilai.CreateMode.Factory.store.ICommodity;

/**
 * 工厂类
 */
public class StoreFactory {
    public ICommodity getCommodityService(Integer commodityType) {
        if (null == commodityType) return null;
        if (1 == commodityType) return new CouponCommodityService();
        if (2 == commodityType) return new GoodsCommodityService();
        if (3 == commodityType) return new CardCommodityService();
        throw new RuntimeException("不存在的商品服务类型");
    }
}
