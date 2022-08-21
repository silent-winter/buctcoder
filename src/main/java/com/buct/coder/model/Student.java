package com.buct.coder.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author xinzi
 * @since 2022-08-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("student")
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 学号
     */
    @TableField("stu_no")
    private String stuNo;

    /**
     * 姓名
     */
    @TableField("name")
    private String name;

    /**
     * 班级
     */
    @TableField("class_name")
    private String className;

    /**
     * 性别（m：男，f：女）
     */
    @TableField("sex")
    private String sex;

    /**
     * 学校
     */
    @TableField("school")
    private String school;

    /**
     * 入学年份
     */
    @TableField("year")
    private Integer year;

    /**
     * cf排名
     */
    @TableField("cf_rating")
    private Integer cfRating;

    /**
     * ac排名
     */
    @TableField("ac_rating")
    private Integer acRating;

    /**
     * 牛客排名
     */
    @TableField("nc_rating")
    private Integer ncRating;

    @TableField("create_time")
    private Date createTime;

    @TableField("update_time")
    private Date updateTime;

    @TableField("cf_id")
    private String cfId;
    @TableField("ac_id")
    private String acId;
    @TableField("nc_id")
    private String ncId;
}
