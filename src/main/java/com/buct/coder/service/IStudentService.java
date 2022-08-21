package com.buct.coder.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.buct.coder.facade.request.StudentPageRequest;
import com.buct.coder.model.Student;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author xinzi
 * @since 2022-08-17
 */
public interface IStudentService extends IService<Student> {

    Page<Student> queryPage(StudentPageRequest studentPageRequest);

}
