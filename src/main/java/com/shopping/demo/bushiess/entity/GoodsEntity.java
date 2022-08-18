package com.shopping.demo.bushiess.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * <p>
 * 商品
 * </p>
 *
 * @author zengzhili
 * @since 2022-08-18
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("goods")
public class GoodsEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 类目id
     */
    @TableField("category_id")
    private Integer categoryId;

    /**
     * 规格类目id
     */
    @TableField("spec_category_id")
    private Integer specCategoryId;

    /**
     * 商品标题
     */
    @TableField("title")
    private String title;

    /**
     * 商品描述
     */
    @TableField("description")
    private String description;

    /**
     * 销售价
     */
    @TableField("amount")
    private BigDecimal amount;

    /**
     * 成本价
     */
    @TableField("amount_cost")
    private BigDecimal amountCost;

    /**
     * json
     */
    @TableField("data_json")
    private String dataJson;

    /**
     * 商品状态：1->在售；2->下架；
     */
    @TableField("status")
    private Integer status;

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
