package com.ynzs.interview.service.impl;

import com.ynzs.interview.entity.InterviewInfo;
import com.ynzs.interview.mapper.InterviewInfoMapper;
import com.ynzs.interview.service.InterviewInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 考生面试信息表 服务实现类
 * </p>
 *
 * @author myk
 * @since 2022-08-02
 */
@Service
public class InterviewInfoServiceImpl extends ServiceImpl<InterviewInfoMapper, InterviewInfo> implements InterviewInfoService {

}
