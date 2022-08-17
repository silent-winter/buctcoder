package com.buct.coder.service.impl;

import com.buct.coder.model.Contest;
import com.buct.coder.mapper.ContestMapper;
import com.buct.coder.service.IContestService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 近期比赛信息 服务实现类
 * </p>
 *
 * @author xinzi
 * @since 2022-08-17
 */
@Service
public class ContestServiceImpl extends ServiceImpl<ContestMapper, Contest> implements IContestService {

}
