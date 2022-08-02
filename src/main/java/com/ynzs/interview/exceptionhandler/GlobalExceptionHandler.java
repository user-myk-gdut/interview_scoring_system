package com.ynzs.interview.exceptionhandler;


import com.ynzs.interview.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author myk
 * @create 2022-07-14 21:46
 */
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
//全局异常处理
    //指定出现什么异常会执行这个方法
    @ExceptionHandler(Exception.class)
    //因为他不在Controller中。没有@RestController，所以数据不会返回，需要加@ResponeseBody返回数据
    @ResponseBody
    public R error(Exception e){
        e.printStackTrace();
        return R.error().message("执行了全局异常处理。。。");
    }

//特定异常处理
    //指定出现什么异常会执行这个方法
    @ExceptionHandler(ArithmeticException.class)
    //因为他不在Controller中。没有@RestController，所以数据不会返回，需要加@ResponeseBody返回数据
    @ResponseBody
    public R error(ArithmeticException e){
        e.printStackTrace();
        return R.error().message("执行了全局异常处理。。。");
    }

//自定义异常处理
    //指定出现什么异常会执行这个方法
    @ExceptionHandler(InterviewException.class)
    //因为他不在Controller中。没有@RestController，所以数据不会返回，需要加@ResponeseBody返回数据
    @ResponseBody
    public R error(InterviewException e){
        e.printStackTrace();
        log.error(e.getMessage());
        return R.error().code(e.getCode()).message(e.getMsg());
    }

}

