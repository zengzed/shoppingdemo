package com.shopping.demo.bushiess.model.req;

import lombok.Data;

import java.util.List;

@Data
public class CreateOrderFormReq {
    //用户id
    private Integer userId;
    //form goodsItems
    private List<OrderFormGoodsItemsReq> formGoodsItemsReqList;

}
