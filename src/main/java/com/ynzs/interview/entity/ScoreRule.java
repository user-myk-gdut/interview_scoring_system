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
 * 评分规则表
 * </p>
 *
 * @author myk
 * @since 2022-08-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="ScoreRule对象", description="评分规则表")
public class ScoreRule implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "规则ID")
    @TableId(value = "id", type = IdType.ID_WORKER_STR)
    private String id;

    @ApiModelProperty(value = "考试编号")
    private String examId;

    @ApiModelProperty(value = "评分模块")
    private String scoreModular;

    @ApiModelProperty(value = "分数占比")
    private Integer scoreProportion;


}
