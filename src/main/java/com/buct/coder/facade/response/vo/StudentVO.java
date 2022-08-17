package com.buct.coder.facade.response.vo;

import lombok.Builder;
import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description:
 * @Auther: xinzi
 * @Date: 2022/08/17/22:37
 */
@Data
@Builder
public class StudentVO {

    private Long id;
    private String stuNo;
    private String name;
    private String className;
    private String sex;
    private String school;
    private Integer year;
    private Integer cfRating;
    private Integer acRating;
    private Integer ncRating;

}
