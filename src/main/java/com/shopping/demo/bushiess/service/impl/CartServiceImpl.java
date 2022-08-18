package com.shopping.demo.bushiess.service.impl;

import com.shopping.demo.bushiess.entity.CartEntity;
import com.shopping.demo.bushiess.dao.CartDao;
import com.shopping.demo.bushiess.service.CartService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 购物车 服务实现类
 * </p>
 *
 * @author zengzhili
 * @since 2022-08-18
 */
@Service
public class CartServiceImpl extends ServiceImpl<CartDao, CartEntity> implements CartService {

}
