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
 * 考试规则表
 * </p>
 *
 * @author myk
 * @since 2022-08-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="ExamRule对象", description="考试规则表")
public class ExamRule implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "考试编号")
    @TableId(value = "id", type = IdType.ID_WORKER_STR)
    private String id;

    @ApiModelProperty(value = "考试名称  汕头市公务员考试等")
    private String examName;

    @ApiModelProperty(value = "岗位地点  汕头市")
    private String jobLocation;

    @ApiModelProperty(value = "人均考试时间 2小时")
    private String examTime;

    @ApiModelProperty(value = "考试形式 一对多 多对多等")
    private String examForm;

    @ApiModelProperty(value = "考试规则 0 盲选  1 非盲选")
    private Boolean examRule;

    @ApiModelProperty(value = "早上考间个数")
    private Integer mornRoomCount;

    @ApiModelProperty(value = "下午考间个数")
    private Integer afterRoomCount;


}
