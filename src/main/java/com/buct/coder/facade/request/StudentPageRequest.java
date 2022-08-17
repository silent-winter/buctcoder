package com.buct.coder.facade.request;

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description:
 * @Auther: xinzi
 * @Date: 2022/08/17/22:43
 */
@Data
public class StudentPageRequest {

    private Boolean isActiveDuty;
    private String query;
    private Integer page;
    private Integer size;

}
