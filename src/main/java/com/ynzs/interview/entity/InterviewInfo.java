package com.ynzs.interview.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 考生面试信息表
 * </p>
 *
 * @author myk
 * @since 2022-08-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="InterviewInfo对象", description="考生面试信息表")
public class InterviewInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "考生面试信息ID")
    @TableId(value = "id", type = IdType.ID_WORKER_STR)
    private String id;

    @ApiModelProperty(value = "考试编号ID")
    private String examId;

    @ApiModelProperty(value = "身份证")
    private String card;

    @ApiModelProperty(value = "候考场ID ")
    private String waitId;

    @ApiModelProperty(value = "考试间ID")
    private String examPlaceId;

    @ApiModelProperty(value = "创建时间")
    @TableField(fill = FieldFill.INSERT)// 添加时，自动填充
    private Date createDate;

    @ApiModelProperty(value = "更新时间")
    @TableField(fill = FieldFill.INSERT_UPDATE)// 添加、修改时，自动填充
    private Date modifiedDate;


}
