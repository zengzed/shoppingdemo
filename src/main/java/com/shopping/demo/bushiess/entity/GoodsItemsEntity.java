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
 * 商品规格
 * </p>
 *
 * @author zengzhili
 * @since 2022-08-18
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("goods_items")
public class GoodsItemsEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 商品id
     */
    @TableField("goods_id")
    private Integer goodsId;

    /**
     * 规格json
     */
    @TableField("spec_json")
    private String specJson;

    /**
     * 库存
     */
    @TableField("stock")
    private Integer stock;

    /**
     * 冻结库存
     */
    @TableField("stock_freeze")
    private Integer stockFreeze;

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
