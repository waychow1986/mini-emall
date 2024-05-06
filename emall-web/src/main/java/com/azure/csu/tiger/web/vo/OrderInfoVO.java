package com.azure.csu.tiger.web.vo;

import com.azure.csu.tiger.grpc.lib.OrderInfo;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class OrderInfoVO {

    private String orderSn;

    private Long userId;

    private String address;

    private String status;

    private String sourceType;

    private Long totalAmount;

    private Long couponAmount;

    private Long shippingAmount;

    private Long payAmount;

    private String createTime;

    private String comment;

    private List<OrderItemVO> skuItems;

    public static OrderInfoVO from(OrderInfo order) {
        OrderInfoVO vo = new OrderInfoVO();
        vo.setOrderSn(order.getOrderSn());
        vo.setUserId(order.getUserId());
        vo.setAddress(order.getAddress());
        vo.setStatus(order.getStatus());
        vo.setSourceType(order.getSourceType());
        vo.setTotalAmount(order.getTotalAmount());
        vo.setCouponAmount(order.getCouponAmount());
        vo.setShippingAmount(order.getShippingAmount());
        vo.setPayAmount(order.getPayAmount());
        vo.setComment(order.getComment());
        vo.setCreateTime(order.getCreateTime());
        return vo;
    }

}
