package com.buct.coder.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.buct.coder.facade.request.PageRequest;
import com.buct.coder.facade.response.ApiResult;
import com.buct.coder.model.CfProblems;
import com.buct.coder.service.ICfProblemsService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 * cf比赛题目信息 前端控制器
 * </p>
 *
 * @author xinzi
 * @since 2022-08-17
 */
@RestController
@RequestMapping("/cfProblems")
public class CfProblemsController {

    @Resource
    private ICfProblemsService cfProblemsService;


    @PostMapping("/list")
    public ApiResult<Page<CfProblems>> findPage(@RequestBody PageRequest pageRequest) {
        return ApiResult.success(cfProblemsService.page(
                new Page<>(pageRequest.getPage(), pageRequest.getSize())
        ));
    }

}
