package com.shopping.demo.bushiess.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.shopping.demo.bushiess.model.dto.GoodsItemsDto;
import com.shopping.demo.bushiess.model.req.CreateOrderFormReq;
import com.shopping.demo.bushiess.model.req.GoodsItemsListReq;
import com.shopping.demo.bushiess.service.OrderFormService;
import com.shopping.demo.common.model.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 订单信息 前端控制器
 * </p>
 *
 * @author zengzhili
 * @since 2022-08-18
 */
@RestController
@RequestMapping("/order-form")
public class OrderFormController {

    @Autowired
    private OrderFormService orderFormService;

    /**
     * 创建订单
     *
     * @param createOrderFormReq 创建订单，商品数量都是1
     * @return 订单号
     */
    @PostMapping("/create-new-order-form")
    public ResultData<String> createNewOrderForm(@RequestBody CreateOrderFormReq createOrderFormReq) {
        String orderNo = orderFormService.createNewOrderForm(createOrderFormReq);
        return ResultData.success(orderNo);
    }

}
