package com.xingheng.eurekaprovider2test.service;

import com.xingheng.eurekaprovider2test.model.OrderModel;

/**
 * Created by zhangyu on 2018/8/29
 */
public interface OrderService {

    public OrderModel findOrderByOrderId(Long orderId) ;
}
