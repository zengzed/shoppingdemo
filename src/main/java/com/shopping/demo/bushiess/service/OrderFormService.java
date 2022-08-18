package com.shopping.demo.bushiess.service;

import com.shopping.demo.bushiess.entity.OrderFormEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.shopping.demo.bushiess.model.req.CreateOrderFormReq;

/**
 * <p>
 * 订单信息 服务类
 * </p>
 *
 * @author zengzhili
 * @since 2022-08-18
 */
public interface OrderFormService extends IService<OrderFormEntity> {

    /**
     * 创建订单
     *
     * @param createOrderFormReq createOrderFormReq
     * @return 订单号
     */
    String createNewOrderForm(CreateOrderFormReq createOrderFormReq);

}
