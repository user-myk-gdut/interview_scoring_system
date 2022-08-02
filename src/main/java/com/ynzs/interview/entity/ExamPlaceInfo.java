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
 * 考试间表
 * </p>
 *
 * @author myk
 * @since 2022-08-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="ExamPlaceInfo对象", description="考试间表")
public class ExamPlaceInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "考试间编号")
    @TableId(value = "id", type = IdType.ID_WORKER_STR)
    private String id;

    @ApiModelProperty(value = "教室名称")
    private String name;

    @ApiModelProperty(value = "岗位ID")
    private String jobId;

    @ApiModelProperty(value = "容纳人数")
    private Integer capacity;

    @ApiModelProperty(value = "剩余人数")
    private Integer surplus;

    @ApiModelProperty(value = "未满状态 1，已满状态 2")
    private Integer state;


}
