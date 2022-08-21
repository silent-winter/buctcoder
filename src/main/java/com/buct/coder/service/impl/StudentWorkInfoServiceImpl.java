package com.buct.coder.service.impl;

import com.buct.coder.model.StudentWorkInfo;
import com.buct.coder.mapper.StudentWorkInfoMapper;
import com.buct.coder.service.IStudentWorkInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 学生做题统计表 服务实现类
 * </p>
 *
 * @author xinzi
 * @since 2022-08-18
 */
@Service
public class StudentWorkInfoServiceImpl extends ServiceImpl<StudentWorkInfoMapper, StudentWorkInfo> implements IStudentWorkInfoService {

}
