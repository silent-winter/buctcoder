package com.buct.coder.core.spider;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.buct.coder.core.util.HttpRequest;
import com.buct.coder.model.Student;
import com.buct.coder.service.IStudentService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description:
 * @Auther: xinzi
 * @Date: 2022/08/21/14:58
 */
@Component
@Slf4j
public class CfDataSpider {

    @Resource
    private IStudentService studentService;


    @Scheduled(cron ="0/30 * * * * ?")
    public void refreshData() {
        List<Student> students = studentService.list();
        for (Student student : students) {
            String cfId = student.getCfId();
            if (StringUtils.isBlank(cfId)) {
                continue;
            }
            String data = HttpRequest.sendGet("https://codeforces.com/api/user.rating?handle=" + cfId);
            JSONObject jsonObject = JSONObject.parseObject(data);
            JSONArray result = jsonObject.getJSONArray("result");
            log.info("result={}", result);
        }
    }

}
