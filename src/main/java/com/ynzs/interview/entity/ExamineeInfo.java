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
 * 考生信息表
 * </p>
 *
 * @author myk
 * @since 2022-08-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="ExamineeInfo对象", description="考生信息表")
public class ExamineeInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "考生ID")
    @TableId(value = "id", type = IdType.ID_WORKER_STR)
    private String id;

    @ApiModelProperty(value = "考生姓名")
    private String name;

    @ApiModelProperty(value = "考生照片")
    private String avatar;

    @ApiModelProperty(value = "意向岗位 ")
    private String intentJob;

    @ApiModelProperty(value = "简历存储位置")
    private String resumeLocation;

    @ApiModelProperty(value = "已经签到 1，未签到 2")
    private Integer state;

    @ApiModelProperty(value = "身份证")
    private String card;

    @ApiModelProperty(value = "创建时间")
    @TableField(fill = FieldFill.INSERT)// 添加时，自动填充
    private Date createDate;

    @ApiModelProperty(value = "更新时间")
    @TableField(fill = FieldFill.INSERT_UPDATE)// 添加、修改时，自动填充
    private Date modifiedDate;


}
