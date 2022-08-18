package com.shopping.demo.bushiess.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.shopping.demo.bushiess.entity.GoodsItemsEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.shopping.demo.bushiess.model.dto.GoodsItemsDto;
import com.shopping.demo.bushiess.model.req.GoodsItemsListReq;

/**
 * <p>
 * 商品规格 服务类
 * </p>
 *
 * @author zengzhili
 * @since 2022-08-18
 */
public interface GoodsItemsService extends IService<GoodsItemsEntity> {

    /**
     * 分页查询数据
     *
     * @param goodsItemsListReq goodsItemsListReq
     * @return IPage<GoodsItemsDto>
     */
    IPage<GoodsItemsDto> pageByGoodsItemsListReq(GoodsItemsListReq goodsItemsListReq);

}
