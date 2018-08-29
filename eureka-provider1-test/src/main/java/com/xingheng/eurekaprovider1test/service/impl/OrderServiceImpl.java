package com.xingheng.eurekaprovider1test.service.impl;

import com.xingheng.eurekaprovider1test.entity.Order;
import com.xingheng.eurekaprovider1test.model.OrderModel;
import com.xingheng.eurekaprovider1test.service.OrderService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by zhangyu on 2018/8/29
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Override
    public OrderModel findOrderByOrderId(Long orderId) {
        OrderModel orderModel = new OrderModel();
        if (orderId.equals(2L)) {
            Order order = new Order();
            order.setCreateTime(new Date());
            order.setOrderNo(2L);
            BeanUtils.copyProperties(order, orderModel);
        }
        return orderModel;
    }
}
