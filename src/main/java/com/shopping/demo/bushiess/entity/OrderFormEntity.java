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
 * 订单信息
 * </p>
 *
 * @author zengzhili
 * @since 2022-08-18
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("order_form")
public class OrderFormEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户id
     */
    @TableField("user_id")
    private Integer userId;

    /**
     * 订单号
     */
    @TableField("order_no")
    private String orderNo;

    /**
     * 订单金额
     */
    @TableField("amount")
    private BigDecimal amount;

    /**
     * 收件人
     */
    @TableField("recipient")
    private String recipient;

    /**
     * 收件人手机号
     */
    @TableField("recipient_mobile")
    private String recipientMobile;

    /**
     * 收件人详细地址
     */
    @TableField("recipient_address")
    private String recipientAddress;

    /**
     * 订单状态：1 -> 创建,2 -> 待支付 ,3 -> 待出库 ,4 -> 已出库, 5 -> 取消
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
