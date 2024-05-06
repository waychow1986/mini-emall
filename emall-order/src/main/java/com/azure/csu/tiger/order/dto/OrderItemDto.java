package com.azure.csu.tiger.order.dto;

import com.azure.csu.tiger.grpc.lib.OrderInfo;
import com.azure.csu.tiger.grpc.lib.OrderItemSku;
import com.azure.csu.tiger.order.jooq.tables.records.OrderInfoRecord;
import com.azure.csu.tiger.order.jooq.tables.records.OrderItemRecord;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class OrderItemDto {

    private Long id;

    private Long orderId;

    private Long skuId;

    private Long skuPrice;

    private Long skuNum;

    private Long splitCouponAmount;

    private Long createUserId;

    private Long modifyUserId;

    public static OrderItemDto fromGrpcOrderItem(OrderItemSku item) {
        OrderItemDto dto = new OrderItemDto();
        dto.setSkuId(item.getSkuId());
        dto.setSkuNum(item.getSkuNum());
        dto.setSkuPrice(item.getSkuPrice());
        dto.setSplitCouponAmount(item.getSplitCouponAmount());
        return dto;
    }

    public OrderItemRecord toRecord(Long orderId) {
        OrderItemRecord record = new OrderItemRecord();
        record.setOrderId(orderId);
        record.setSkuId(skuId);
        record.setSkuPrice(skuPrice);
        record.setSkuNum(skuNum.intValue());
        record.setSplitCouponAmount(splitCouponAmount);
        record.setCreateUserId(createUserId);
        record.setModifyUserId(modifyUserId);
        return record;
    }

    public static OrderItemSku transformRecordToGrpc(OrderItemRecord record) {
        return OrderItemSku.newBuilder().setSkuId(record.getSkuId())
                .setSkuPrice(record.getSkuPrice())
                .setSkuNum(record.getSkuNum())
                .setSplitCouponAmount(record.getSplitCouponAmount())
                .setSkuName("").build();
    }
}
