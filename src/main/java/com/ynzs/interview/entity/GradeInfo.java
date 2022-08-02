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
 * 学生成绩表
 * </p>
 *
 * @author myk
 * @since 2022-08-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="GradeInfo对象", description="学生成绩表")
public class GradeInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "学生成绩ID")
    @TableId(value = "id", type = IdType.ID_WORKER_STR)
    private String id;

    @ApiModelProperty(value = "考试编号")
    private String examId;

    @ApiModelProperty(value = "考官编号")
    private String examinerId;

    @ApiModelProperty(value = "考生编号")
    private String examineeId;

    @ApiModelProperty(value = "规则编号ID")
    private String scoreId;

    @ApiModelProperty(value = "模块分数")
    private Integer grade;


}
