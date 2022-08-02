package com.ynzs.interview.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 考官信息表
 * </p>
 *
 * @author myk
 * @since 2022-08-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="ExaminerInfo对象", description="考官信息表")
public class ExaminerInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "考官ID")
    @TableId(value = "id", type = IdType.ID_WORKER_STR)
    private String id;

    @ApiModelProperty(value = "考官姓名")
    private String name;

    @ApiModelProperty(value = "考官性别 0 女 1男")
    private Boolean sex;

    @ApiModelProperty(value = "考官工作地点 ")
    private String workplace;

    @ApiModelProperty(value = "考官类别 ")
    private String type;

    @ApiModelProperty(value = "登陆密码")
    private String password;

    @ApiModelProperty(value = "空闲状态 1，忙碌状态 2")
    private Integer state;

    @ApiModelProperty(value = "逻辑删除 1（true）已删除， 0（false）未删除")
    @TableLogic
    private Integer isDeleted;

    @ApiModelProperty(value = "创建时间")
    @TableField(fill = FieldFill.INSERT)// 添加时，自动填充
    private Date createDate;

    @ApiModelProperty(value = "更新时间")
    @TableField(fill = FieldFill.INSERT_UPDATE)// 添加、修改时，自动填充
    private Date modifiedDate;


}
