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
 * 考生抽签规则表
 * </p>
 *
 * @author myk
 * @since 2022-08-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="ExamineeDrawRule对象", description="考生抽签规则表")
public class ExamineeDrawRule implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "考生抽签规则id")
    @TableId(value = "id", type = IdType.ID_WORKER_STR)
    private String id;

    @ApiModelProperty(value = "考试编号")
    private String examId;

    @ApiModelProperty(value = "考生规则(0表示完全打散，1表示考试间内打散)")
    private Integer rule;


}
