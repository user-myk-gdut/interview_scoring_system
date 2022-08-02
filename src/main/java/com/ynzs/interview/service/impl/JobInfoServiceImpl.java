package com.ynzs.interview.service.impl;

import com.ynzs.interview.entity.JobInfo;
import com.ynzs.interview.mapper.JobInfoMapper;
import com.ynzs.interview.service.JobInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 岗位表 服务实现类
 * </p>
 *
 * @author myk
 * @since 2022-08-02
 */
@Service
public class JobInfoServiceImpl extends ServiceImpl<JobInfoMapper, JobInfo> implements JobInfoService {

}
