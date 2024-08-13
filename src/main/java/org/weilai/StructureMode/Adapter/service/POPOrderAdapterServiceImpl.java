package org.weilai.StructureMode.Adapter.service;

import org.weilai.StructureMode.Adapter.adapter.OrderAdapterService;

public class POPOrderAdapterServiceImpl implements OrderAdapterService {
 private POPOrderService popOrderService = new POPOrderService();
 public boolean isFirst(String uId) {
 return popOrderService.isFirstOrder(uId);
 }
}