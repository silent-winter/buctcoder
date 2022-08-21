package com.buct.coder.facade.request;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description:
 * @Auther: xinzi
 * @Date: 2022/08/17/22:43
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class StudentPageRequest extends PageRequest {

    private Boolean isActiveDuty;
    private String query;

}
