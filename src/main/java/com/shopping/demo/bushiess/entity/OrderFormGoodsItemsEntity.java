package com.shopping.demo.bushiess.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * <p>
 * 订单商品
 * </p>
 *
 * @author zengzhili
 * @since 2022-08-18
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("order_form_goods_items")
public class OrderFormGoodsItemsEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 订单id
     */
    @TableField("form_id")
    private Integer formId;

    /**
     * 订单商品id
     */
    @TableField("goods_items_id")
    private Integer goodsItemsId;

    /**
     * 数量
     */
    @TableField("quantity")
    private Integer quantity;

    /**
     * 是否删除：0否，1是
     */
    @TableField("is_delete")
    @TableLogic
    private Integer isDelete;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    @TableField("update_time")
    private LocalDateTime updateTime;


}
