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
 * 学生做题统计表
 * </p>
 *
 * @author xinzi
 * @since 2022-08-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("student_work_info")
public class StudentWorkInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 学生id
     */
    @TableField("stu_id")
    private Long stuId;

    /**
     * 题目标签
     */
    @TableField("tag")
    private String tag;

    /**
     * 标签名
     */
    @TableField("tag_name")
    private String tagName;

    /**
     * 该标签做题数
     */
    @TableField("count")
    private Integer count;

    @TableField("create_time")
    private Date createTime;

    @TableField("update_time")
    private Date updateTime;


}
