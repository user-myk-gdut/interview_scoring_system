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
 * 考官抽签规则表
 * </p>
 *
 * @author myk
 * @since 2022-08-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="ExaminerDrawRule对象", description="考官抽签规则表")
public class ExaminerDrawRule implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "考官抽签规则id")
    @TableId(value = "id", type = IdType.ID_WORKER_STR)
    private String id;

    @ApiModelProperty(value = "考试编号id")
    private String examId;

    @ApiModelProperty(value = "每个教室男考官人数")
    private Integer boyNumber;

    @ApiModelProperty(value = "每个教室女考官人数")
    private Integer girlNumber;


}
