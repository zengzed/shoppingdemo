package com.shopping.demo.bushiess.model.req;

import lombok.Data;

@Data
public class OrderFormGoodsItemsReq {
    //商品规格id
    private Integer goodsItemsId;
    //数量
    private Integer quantity;
}
