package com.buct.coder.controller;


import com.buct.coder.facade.request.StudentPageRequest;
import com.buct.coder.facade.response.ApiResult;
import com.buct.coder.facade.response.PageResult;
import com.buct.coder.facade.response.vo.StudentVO;
import com.buct.coder.model.Student;
import com.buct.coder.service.IStudentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author xinzi
 * @since 2022-08-17
 */
@RestController
@RequestMapping("/student")
public class StudentController {

    @Resource
    private IStudentService studentService;


    @PostMapping("/list")
    public ApiResult<PageResult<Student>> findStudents(@RequestBody StudentPageRequest studentPageRequest) {
        return ApiResult.success(studentService.queryPage(studentPageRequest));
    }

}
