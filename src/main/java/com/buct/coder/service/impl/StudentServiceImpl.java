package com.buct.coder.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.buct.coder.facade.request.StudentPageRequest;
import com.buct.coder.facade.response.PageResult;
import com.buct.coder.facade.response.vo.StudentVO;
import com.buct.coder.model.Student;
import com.buct.coder.mapper.StudentMapper;
import com.buct.coder.service.IStudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xinzi
 * @since 2022-08-17
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService {

    @Override
    public PageResult<Student> queryPage(StudentPageRequest studentPageRequest) {
        LambdaQueryWrapper<Student> queryWrapper = buildQueryWrapper(studentPageRequest);
        Page<Student> page = baseMapper.selectPage(
                new Page<>(studentPageRequest.getPage(), studentPageRequest.getSize()), queryWrapper
        );
        PageResult<Student> result = new PageResult<>();
        result.setTotal(page.getTotal());
        result.setCurrent(page.getCurrent());
        result.setSize(page.getSize());
        result.setRecords(page.getRecords());
        return result;
    }


    private LambdaQueryWrapper<Student> buildQueryWrapper(StudentPageRequest studentPageRequest) {
        return new LambdaQueryWrapper<>();
    }
}
