package com.buct.coder.service;

import com.buct.coder.facade.request.StudentPageRequest;
import com.buct.coder.facade.response.PageResult;
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

    PageResult<Student> queryPage(StudentPageRequest studentPageRequest);

}
