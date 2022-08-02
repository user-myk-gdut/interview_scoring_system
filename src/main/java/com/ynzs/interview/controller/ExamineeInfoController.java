package com.ynzs.interview.controller;


import com.ynzs.interview.entity.ExamineeInfo;
import com.ynzs.interview.service.ExamineeInfoService;
import com.ynzs.interview.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 考生信息表 前端控制器
 * </p>
 *
 * @author myk
 * @since 2022-08-02
 */
@RestController
@RequestMapping("/interview/examinee")
public class ExamineeInfoController {
    @Autowired
    private ExamineeInfoService examineeInfoService;

    @RequestMapping("getAllExaminee")
    public R getAllExaminee(){

        List<ExamineeInfo> list = examineeInfoService.list(null);
        System.out.println(list);
        return R.ok().data("list",list);

    }

}

