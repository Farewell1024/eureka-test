package com.xingheng.eurekaconsumertest.controller;

import com.xingheng.eurekaconsumertest.model.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by zhangyu on 2018/8/29
 */
@RestController
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    // discoveryClient获取服务列表中，应用名为sc-eureka-first-provider一个服务注册信息
    public String serviceUrl() {
        List<ServiceInstance> list = discoveryClient
                .getInstances("eureka-provider");
        if (list != null && list.size() > 0) {
            return String.valueOf(list.get(0).getUri());
        }
        return null;
    }

    @GetMapping("/user/{id}")
    public Order findByIdByEurekaServer(@PathVariable Long id) {
        String providerServiceUrl = serviceUrl();
        return this.restTemplate.getForObject(providerServiceUrl + "/order/" + id,
                Order.class);
    }
}
