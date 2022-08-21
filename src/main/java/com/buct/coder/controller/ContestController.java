package com.buct.coder.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.buct.coder.facade.request.PageRequest;
import com.buct.coder.facade.response.ApiResult;
import com.buct.coder.model.Contest;
import com.buct.coder.service.IContestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 * 近期比赛信息 前端控制器
 * </p>
 *
 * @author xinzi
 * @since 2022-08-17
 */
@RestController
@RequestMapping("/contest")
public class ContestController {

    @Resource
    private IContestService contestService;


    @GetMapping("/list")
    public ApiResult<Page<Contest>> findPages(@RequestBody PageRequest pageRequest) {
        return ApiResult.success(contestService.page(
                new Page<>(pageRequest.getPage(), pageRequest.getSize())
        ));
    }

}
