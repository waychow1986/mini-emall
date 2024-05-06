package com.azure.csu.tiger.common.utils;

import java.util.Objects;

public enum OrderStatus {

    PRE_PAY(0, "待支付"),
    PRE_SEND(1, "待发货"),
    PRE_RECEIVE(2, "待收货"),
    FINISH(3, "已完成"),
    CANCEL(4, "已取消");

    private Integer type;
    private String name;

    OrderStatus(Integer type, String name) {
        this.type = type;
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public static OrderStatus fromType(Integer type) {
        for (OrderStatus value : OrderStatus.values()) {
            if (Objects.equals(type, value.getType())) {
                return value;
            }
        }
        return null;
    }
}
