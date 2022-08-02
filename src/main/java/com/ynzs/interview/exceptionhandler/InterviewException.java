package com.ynzs.interview.exceptionhandler;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author myk
 * @create 2022-07-14 22:28
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InterviewException extends RuntimeException{
    @ApiModelProperty(value = "状态码")
    private Integer code;
    private String msg;
}
