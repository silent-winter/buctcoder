package com.buct.coder.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.buct.coder.facade.request.PageRequest;
import com.buct.coder.facade.response.ApiResult;
import com.buct.coder.model.StudentSubmitLog;
import com.buct.coder.service.IStudentSubmitLogService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * <p>
 * 学生参赛提交记录 前端控制器
 * </p>
 *
 * @author xinzi
 * @since 2022-08-17
 */
@RestController
@RequestMapping("/submit-log")
public class StudentSubmitLogController {

    @Resource
    private IStudentSubmitLogService studentSubmitLogService;


    @PostMapping("/list/{contestId}")
    public ApiResult<Page<StudentSubmitLog>> findPages(@PathVariable("contestId") Long contestId,
                                                       @RequestBody PageRequest pageRequest) {
        return ApiResult.success(studentSubmitLogService.page(
                new Page<>(pageRequest.getPage(), pageRequest.getSize()),
                new LambdaQueryWrapper<StudentSubmitLog>().eq(StudentSubmitLog::getContestId, contestId)
        ));
    }

}
