package com.xingheng.eurekaprovider1test.service;

import com.xingheng.eurekaprovider1test.model.OrderModel;

/**
 * Created by zhangyu on 2018/8/29
 */
public interface OrderService {

    public OrderModel findOrderByOrderId(Long orderId) ;
}
