package org.weilai.StructureMode.Adapter.service;

import cn.hutool.db.sql.Order;
import org.weilai.StructureMode.Adapter.adapter.OrderAdapterService;

public class InsideOrderService implements OrderAdapterService {

    private OrderService orderService = new OrderService();
    @Override
    public boolean isFirst(String uId) {
        return orderService.queryUserOrderCount(uId) <= 1;
    }


}
