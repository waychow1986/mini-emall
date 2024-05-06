package com.azure.csu.tiger.web.vo;

import com.azure.csu.tiger.grpc.lib.OrderItemSku;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class OrderItemVO {
    
    private Long skuId;

    private Long skuPrice;

    private Long skuNum;

    private String skuName;
    
    public static OrderItemVO from(OrderItemSku item) {
        OrderItemVO vo = new OrderItemVO();
        vo.setSkuId(item.getSkuId());
        vo.setSkuNum(item.getSkuNum());
        vo.setSkuPrice(item.getSkuPrice());
        return vo;
    }

}
