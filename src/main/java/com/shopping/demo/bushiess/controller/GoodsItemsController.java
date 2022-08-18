package com.shopping.demo.bushiess.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.shopping.demo.bushiess.model.dto.GoodsDto;
import com.shopping.demo.bushiess.model.dto.GoodsItemsDto;
import com.shopping.demo.bushiess.model.req.GoodsItemsListReq;
import com.shopping.demo.bushiess.service.GoodsItemsService;
import com.shopping.demo.common.model.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 商品规格 前端控制器
 * </p>
 *
 * @author zengzhili
 * @since 2022-08-18
 */
@RestController
@RequestMapping("/goods-items")
public class GoodsItemsController {

    @Autowired
    private GoodsItemsService goodsItemsService;

    /**
     * 分页
     *
     * @param goodsItemsListReq
     * @return
     */
    @PostMapping("/page")
    public ResultData<IPage<GoodsItemsDto>> list(@RequestBody GoodsItemsListReq goodsItemsListReq) {
        IPage<GoodsItemsDto> goodsItemsDtoIPage = goodsItemsService.pageByGoodsItemsListReq(goodsItemsListReq);
        return ResultData.success(goodsItemsDtoIPage);
    }
}
