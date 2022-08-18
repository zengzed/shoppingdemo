CREATE TABLE `user`
(
    `id`          int         NOT NULL AUTO_INCREMENT COMMENT '主键',
    `username`    varchar(32) NOT NULL DEFAULT '' COMMENT '用户名',
    `password`    varchar(32) NOT NULL DEFAULT '' COMMENT '密码',
    `nickname`    varchar(256)         DEFAULT NULL COMMENT '昵称',
    `status`      tinyint     NOT NULL DEFAULT '0' COMMENT '状态： 0正常 1禁用',
    `is_delete`   tinyint     NOT NULL DEFAULT '0' COMMENT '是否删除：0否，1是',
    `create_time` timestamp   NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_time` timestamp   NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='用户';

CREATE TABLE `goods`
(
    `id`               int       NOT NULL AUTO_INCREMENT COMMENT '主键',
    `category_id`      int                DEFAULT NULL COMMENT '类目id',
    `spec_category_id` int                DEFAULT NULL COMMENT '规格类目id',
    `title`            varchar(255)       DEFAULT NULL COMMENT '商品标题',
    `description`      text COMMENT '商品描述',
    `amount`           decimal(10, 2)     DEFAULT NULL COMMENT '销售价',
    `amount_cost`      decimal(10, 2)     DEFAULT NULL COMMENT '成本价',
    `data_json`        json               DEFAULT NULL COMMENT 'json',
    `status`           int       NOT NULL DEFAULT '1' COMMENT '商品状态：1->在售；2->下架；',
    `is_delete`        tinyint   NOT NULL DEFAULT '0' COMMENT '是否删除：0否，1是',
    `create_time`      timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_time`      timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='商品';


CREATE TABLE `goods_items`
(
    `id`           int       NOT NULL AUTO_INCREMENT COMMENT '主键',
    `goods_id`     int       NOT NULL DEFAULT '0' COMMENT '商品id',
    `spec_json`    json               DEFAULT NULL COMMENT '规格json',
    `stock`        int       NOT NULL DEFAULT '0' COMMENT '库存',
    `stock_freeze` int       NOT NULL DEFAULT '0' COMMENT '冻结库存',
    `is_delete`    tinyint   NOT NULL DEFAULT '0' COMMENT '是否删除：0否，1是',
    `create_time`  timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_time`  timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='商品规格';


CREATE TABLE `order_form`
(
    `id`                int       NOT NULL AUTO_INCREMENT COMMENT '主键',

    `user_id`           int       NOT NULL DEFAULT '0' COMMENT '用户id',
    `order_no`          varchar(256)       DEFAULT NULL COMMENT '订单号',
    `amount`            decimal(10, 2)     DEFAULT NULL COMMENT '订单金额',
    `recipient`         varchar(256)       DEFAULT NULL COMMENT '收件人',
    `recipient_mobile`  varchar(256)       DEFAULT NULL COMMENT '收件人手机号',
    `recipient_address` varchar(256)       DEFAULT NULL COMMENT '收件人详细地址',

    `status`            int       NOT NULL DEFAULT '1' COMMENT '订单状态：1 -> 创建,2 -> 待支付 ,3 -> 待出库 ,4 -> 已出库, 5 -> 取消',
    `is_delete`         tinyint   NOT NULL DEFAULT '0' COMMENT '是否删除：0否，1是',
    `create_time`       timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_time`       timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='订单信息';



CREATE TABLE `order_form_goods_items`
(
    `id`             int       NOT NULL AUTO_INCREMENT COMMENT '主键',

    `form_id`        int       NOT NULL DEFAULT '0' COMMENT '订单id',
    `goods_items_id` int       NOT NULL DEFAULT '0' COMMENT '商品id',
    `quantity`       int       NOT NULL DEFAULT '0' COMMENT '数量',

    `is_delete`      tinyint   NOT NULL DEFAULT '0' COMMENT '是否删除：0否，1是',
    `create_time`    timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_time`    timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='订单商品';



CREATE TABLE `cart`
(
    `id`             int       NOT NULL AUTO_INCREMENT COMMENT '主键',
    `user_id`        int       NOT NULL DEFAULT '0' COMMENT '用户id',
    `goods_items_id` int       NOT NULL DEFAULT '0' COMMENT '商品id',
    `quantity`       int       NOT NULL DEFAULT '0' COMMENT '数量',

    `is_delete`      tinyint   NOT NULL DEFAULT '0' COMMENT '是否删除：0否，1是',
    `create_time`    timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `update_time`    timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='购物车';