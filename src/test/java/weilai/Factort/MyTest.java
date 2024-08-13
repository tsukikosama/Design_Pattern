package weilai.Factort;


import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.weilai.CreateMode.AbstracFactory.Adapter.EGMCacheAdapter;
import org.weilai.CreateMode.AbstracFactory.Adapter.IIRCacheAdapter;
import org.weilai.CreateMode.AbstracFactory.Factory.JDKProxy;
import org.weilai.CreateMode.AbstracFactory.service.CacheService;
import org.weilai.CreateMode.AbstracFactory.service.impl.CacheServiceImpl;
import org.weilai.CreateMode.Builder.Builder.Builder;
import org.weilai.CreateMode.Factory.StoreFactory;
import org.weilai.CreateMode.Factory.store.ICommodity;
import org.weilai.StructureMode.Adapter.adapter.MQAdapter;
import org.weilai.StructureMode.Adapter.adapter.OrderAdapterService;
import org.weilai.StructureMode.Adapter.entity.RebateInfo;
import org.weilai.StructureMode.Adapter.mq.OrderMq;
import org.weilai.StructureMode.Adapter.mq.create_account;
import org.weilai.StructureMode.Adapter.service.InsideOrderService;
import org.weilai.StructureMode.Adapter.service.POPOrderAdapterServiceImpl;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class MyTest {
    @Test
    public void test_commodity() throws Exception {
        StoreFactory storeFactory = new StoreFactory();
        // 1. 优惠券
        ICommodity commodityService_1 = storeFactory.getCommodityService(1);
        commodityService_1.sendCommodity("10001", "EGM1023938910232121323432",
                "791098764902132", null);
        // 2. 实物商品
        ICommodity commodityService_2 = storeFactory.getCommodityService(2);

        Map<String, String> extMap = new HashMap<String, String>();
        extMap.put("consigneeUserName", "谢⻜机");
        extMap.put("consigneeUserPhone", "15200292123");
        extMap.put("consigneeUserAddress", "吉林省.⻓春市.双阳区.XX街道.檀溪苑⼩ 区.#18-2109");
        commodityService_2.sendCommodity("10001", "9820198721311", "1023000020112221113", extMap);
        // 3. 第三⽅兑换卡(爱奇艺)
        ICommodity commodityService_3 = storeFactory.getCommodityService(3);

        commodityService_3.sendCommodity("10001", "AQY1xjkUodl8LO975GdfrYUio", null
                , null);
    }

    @Test
    public void test_CacheService() throws Exception {
        CacheService proxy_EGM = JDKProxy.getProxy(CacheServiceImpl.class, new
                EGMCacheAdapter());
        proxy_EGM.set("user_name_01", "⼩傅哥");
        String val01 = proxy_EGM.get("user_name_01");
        System.out.println(val01);

        CacheService proxy_IIR = JDKProxy.getProxy(CacheServiceImpl.class, new
                IIRCacheAdapter());
        proxy_IIR.set("user_name_01", "⼩傅哥");
        String val02 = proxy_IIR.get("user_name_01");
        System.out.println(val02);
    }

    @Test
    public void test_Builder() throws Exception {
        Builder builder = new Builder();
        // 豪华欧式
        System.out.println(builder.levelOne(132.52D).getDetail());
        // 轻奢⽥园
        System.out.println(builder.levelTwo(98.25D).getDetail());
        // 现代简约
        System.out.println(builder.levelThree(85.43D).getDetail());
    }


    @Test
    public void test_MQAdapter() throws NoSuchMethodException,
            IllegalAccessException, InvocationTargetException {
        create_account create_account = new create_account();
        create_account.setNumber("100001");
        create_account.setAddress("河北省.廊坊市.⼴阳区.⼤学⾥职业技术学院");
        create_account.setAccountDate(new Date());
        create_account.setDesc("在校开户");
        HashMap<String, String> link01 = new HashMap<String, String>();
        link01.put("userId", "number");
        link01.put("bizId", "number");
        link01.put("bizTime", "accountDate");
        link01.put("desc", "desc");
        RebateInfo rebateInfo01 = MQAdapter.filter(create_account.toString(),
                link01);
        System.out.println("mq.create_account(适配前)" +
                create_account.toString());
        System.out.println("mq.create_account(适配后)" +
                JSON.toJSONString(rebateInfo01));
        System.out.println("");
        OrderMq orderMq = new OrderMq();
        orderMq.setUid("100001");
        orderMq.setSku("10928092093111123");
        orderMq.setOrderId("100000890193847111");
        orderMq.setCreateOrderTime(new Date());
        HashMap<String, String> link02 = new HashMap<String, String>();
        link02.put("userId", "uid");
        link02.put("bizId", "orderId");
        link02.put("bizTime", "createOrderTime");
        RebateInfo rebateInfo02 = MQAdapter.filter(orderMq.toString(),
                link02);
        System.out.println("mq.orderMq(适配前)" + orderMq.toString());
        System.out.println("mq.orderMq(适配后)" +
                JSON.toJSONString(rebateInfo02));

    }

    @Test
    public void test_itfAdapter() {
        OrderAdapterService popOrderAdapterService = new
                POPOrderAdapterServiceImpl();
        System.out.println("判断⾸单，接⼝适配(POP)：" +
                popOrderAdapterService.isFirst("100001"));
        OrderAdapterService insideOrderService = new InsideOrderService();
        System.out.println("判断⾸单，接⼝适配(⾃营)：" +
                insideOrderService.isFirst("100001"));
    }
}