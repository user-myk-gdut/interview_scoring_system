package com.ynzs.interview.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 候考场表
 * </p>
 *
 * @author myk
 * @since 2022-08-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="WaitInfo对象", description="候考场表")
public class WaitInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "候考场ID")
    @TableId(value = "id", type = IdType.ID_WORKER_STR)
    private String id;

    @ApiModelProperty(value = "候考场名称")
    private String name;

    @ApiModelProperty(value = "容纳人数")
    private Integer capacity;

    @ApiModelProperty(value = "剩余人数")
    private Integer surplus;

    @ApiModelProperty(value = "未满状态 1，已满状态 2")
    private Integer state;


}
