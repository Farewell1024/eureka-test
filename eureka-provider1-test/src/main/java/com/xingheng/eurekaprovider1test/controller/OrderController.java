package com.xingheng.eurekaprovider1test.controller;

import com.xingheng.eurekaprovider1test.model.OrderModel;
import com.xingheng.eurekaprovider1test.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhangyu on 2018/8/29
 */
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/order/{id}")
    public OrderModel findOrderById(@PathVariable Long id) {
        OrderModel orderModel = orderService.findOrderByOrderId(id);
        return orderModel;
    }

}
