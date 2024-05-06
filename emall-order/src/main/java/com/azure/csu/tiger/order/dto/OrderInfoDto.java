package com.azure.csu.tiger.order.dto;

import com.azure.csu.tiger.grpc.lib.CreateOrderRequest;
import com.azure.csu.tiger.order.jooq.tables.records.OrderInfoRecord;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class OrderInfoDto {

    private Long id;

    private Long parentOrderId;

    private String orderSn;

    private Long userId;

    private Long addressId;

    private Integer status;

    private Integer sourceType;

    private Long totalAmount;

    private Long couponAmount;

    private Long shippingAmount;

    private Long payAmount;

    private String shippingNo;

    private Integer paymentType;

    private Date paymentTime;

    private Date sendTime;

    private Date receiveTime;

    private Date finishTime;

    private Date cancelTime;

    private Date createTime;

    private Date modifyTime;

    private String comment;

    private Long createUserId;

    private Long modifyUserId;

    public OrderInfoRecord toRecord() {
        OrderInfoRecord record = new OrderInfoRecord();
        record.setParentOrderId(-1L);
        record.setOrderSn(orderSn);
        record.setUserId(userId);
        record.setAddressId(addressId);
        record.setStatus(status.byteValue());
        record.setSourceType(sourceType.byteValue());
        record.setTotalAmount(totalAmount);
        record.setCouponAmount(couponAmount);
        record.setShippingAmount(shippingAmount);
        record.setPayAmount(payAmount);
        record.setComment(comment);
        record.setCreateUserId(createUserId);
        record.setModifyUserId(modifyUserId);
        return record;
    }

    public static OrderInfoDto from(CreateOrderRequest order) {
        OrderInfoDto dto = new OrderInfoDto();
        dto.setParentOrderId(-1L);
        dto.setUserId(order.getUserId());
        dto.setModifyUserId(order.getUserId());
        dto.setAddressId(dto.getAddressId());
        dto.setSourceType(order.getSourceType());
        dto.setTotalAmount(order.getTotalAmount());
        dto.setCouponAmount(order.getCouponAmount());
        dto.setShippingAmount(order.getShippingAmount());
        dto.setPayAmount(order.getPayAmount());
        dto.setComment(order.getComment());
        return dto;
    }
}
