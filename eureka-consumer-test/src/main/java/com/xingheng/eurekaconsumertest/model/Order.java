package com.xingheng.eurekaconsumertest.model;

import java.util.Date;

/**
 * Created by zhangyu on 2018/8/29
 */
public class Order {
    private Long orderNo;
    private Date createTime;
    private Date payTime;

    public Long getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Long orderNo) {
        this.orderNo = orderNo;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }
}
