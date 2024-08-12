package org.weilai.Factory.store.impl;

import org.weilai.Factory.store.Entity.coupon.CouponInfo;
import org.weilai.Factory.store.Entity.coupon.CouponResult;
import org.weilai.Factory.store.Entity.coupon.CouponService;
import org.weilai.Factory.store.Entity.goods.GoodsService;
import org.weilai.Factory.store.ICommodity;

import java.util.Map;

public class CouponCommodityService implements ICommodity {

    private CouponService couponInfo = new CouponService();
    @Override
    public void sendCommodity(String uid, String commodityId, String bizId, Map<String, String> extMap) throws Exception {

        CouponResult couponResult = couponInfo.sendCoupon(uid, commodityId, bizId);
    }
}
