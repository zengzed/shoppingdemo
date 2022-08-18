package com.shopping.demo.bushiess.service.impl;

import com.shopping.demo.bushiess.entity.UserEntity;
import com.shopping.demo.bushiess.dao.UserDao;
import com.shopping.demo.bushiess.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户 服务实现类
 * </p>
 *
 * @author zengzhili
 * @since 2022-08-18
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, UserEntity> implements UserService {

}
