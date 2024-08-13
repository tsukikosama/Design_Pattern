package org.weilai.CreateMode.Factory.store.impl;

import org.weilai.CreateMode.Factory.store.Entity.coupon.CouponResult;
import org.weilai.CreateMode.Factory.store.Entity.coupon.CouponService;
import org.weilai.CreateMode.Factory.store.ICommodity;

import java.util.Map;

public class CouponCommodityService implements ICommodity {

    private CouponService couponInfo = new CouponService();
    @Override
    public void sendCommodity(String uid, String commodityId, String bizId, Map<String, String> extMap) throws Exception {

        CouponResult couponResult = couponInfo.sendCoupon(uid, commodityId, bizId);
    }
}
