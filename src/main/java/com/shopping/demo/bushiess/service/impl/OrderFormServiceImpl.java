package com.shopping.demo.bushiess.service.impl;

import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import com.shopping.demo.bushiess.entity.GoodsEntity;
import com.shopping.demo.bushiess.entity.GoodsItemsEntity;
import com.shopping.demo.bushiess.entity.OrderFormEntity;
import com.shopping.demo.bushiess.dao.OrderFormDao;
import com.shopping.demo.bushiess.model.req.CreateOrderFormReq;
import com.shopping.demo.bushiess.model.req.OrderFormGoodsItemsReq;
import com.shopping.demo.bushiess.service.GoodsItemsService;
import com.shopping.demo.bushiess.service.GoodsService;
import com.shopping.demo.bushiess.service.OrderFormService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * <p>
 * 订单信息 服务实现类
 * </p>
 *
 * @author zengzhili
 * @since 2022-08-18
 */
@Service
public class OrderFormServiceImpl extends ServiceImpl<OrderFormDao, OrderFormEntity> implements OrderFormService {

    @Autowired
    private GoodsItemsService goodsItemsService;
    @Autowired
    private GoodsService goodsService;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public String createNewOrderForm(CreateOrderFormReq createOrderFormReq) {
        //生成订单号
        List<Integer> goodsItemsIdList = createOrderFormReq.getFormGoodsItemsReqList()
                .stream()
                .map(OrderFormGoodsItemsReq::getGoodsItemsId)
                .collect(Collectors.toList());
        List<GoodsItemsEntity> goodsItemsList = goodsItemsService.listByIds(goodsItemsIdList);
        if (CollectionUtils.isEmpty(goodsItemsList)) {
            throw new RuntimeException("传入的商品不存在");
        }
        Map<Integer, GoodsItemsEntity> idGoodsItemMap = goodsItemsList.stream().collect(Collectors.toMap(GoodsItemsEntity::getId, Function.identity()));
        //计算总金额
        List<Integer> goodsIdList = goodsItemsList.stream().map(GoodsItemsEntity::getGoodsId).distinct().collect(Collectors.toList());
        List<GoodsEntity> goodsList = goodsService.listByIds(goodsIdList);
        Map<Integer, GoodsEntity> idGoodsMap = goodsList.stream().collect(Collectors.toMap(GoodsEntity::getId, Function.identity()));


//        createOrderFormReq.getFormGoodsItemsReqList().


        return null;
    }
}
