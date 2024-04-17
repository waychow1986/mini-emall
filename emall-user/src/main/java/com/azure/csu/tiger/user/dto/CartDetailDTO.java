package com.azure.csu.tiger.user.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CartDetailDTO {

    private Long id;

    private Long userId;

    private Long skuId;

    private Long skuNum;
}
