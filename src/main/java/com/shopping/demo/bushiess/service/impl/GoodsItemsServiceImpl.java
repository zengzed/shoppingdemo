package com.shopping.demo.bushiess.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.shopping.demo.bushiess.entity.GoodsItemsEntity;
import com.shopping.demo.bushiess.dao.GoodsItemsDao;
import com.shopping.demo.bushiess.model.dto.GoodsItemsDto;
import com.shopping.demo.bushiess.model.req.GoodsItemsListReq;
import com.shopping.demo.bushiess.service.GoodsItemsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品规格 服务实现类
 * </p>
 *
 * @author zengzhili
 * @since 2022-08-18
 */
@Service
public class GoodsItemsServiceImpl extends ServiceImpl<GoodsItemsDao, GoodsItemsEntity> implements GoodsItemsService {

    @Override
    public IPage<GoodsItemsDto> pageByGoodsItemsListReq(GoodsItemsListReq goodsItemsListReq) {


        return null;
    }
}
