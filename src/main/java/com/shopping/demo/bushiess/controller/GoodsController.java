package com.shopping.demo.bushiess.controller;

import com.shopping.demo.bushiess.model.dto.GoodsDto;
import com.shopping.demo.bushiess.service.GoodsService;
import com.shopping.demo.common.model.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 商品 前端控制器
 * </p>
 *
 * @author zengzhili
 * @since 2022-08-18
 */
@RestController
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;


    @GetMapping("/list")
    public ResultData<GoodsDto> list() {

//        goodsService.list()

        return null;
    }

}
