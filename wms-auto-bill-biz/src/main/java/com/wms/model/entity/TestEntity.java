package com.wms.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.xac.core.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;


/**
 * <pre>
 * 执行工作订单
 * </pre>
 *
 * @author 云中子
 * @since 2020-01-17
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@TableName("test")
/**
 * 执行工作订单
 */
public class TestEntity extends BaseEntity {

    private static final long serialVersionUID = 1L;


    /**
     * 所属备件
     */
    private String moMdsItemId;

}
