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
 * 学生参赛提交记录
 * </p>
 *
 * @author xinzi
 * @since 2022-08-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("student_submit_log")
public class StudentSubmitLog implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 学生id
     */
    @TableField("stu_id")
    private Long stuId;

    /**
     * 提交id
     */
    @TableField("submit_id")
    private Long submitId;

    /**
     * 提交时间
     */
    @TableField("submit_time")
    private Date submitTime;

    /**
     * 问题名字
     */
    @TableField("question_name")
    private String questionName;

    /**
     * 使用语言
     */
    @TableField("language")
    private String language;

    /**
     * 提交状态（AC）
     */
    @TableField("status")
    private String status;

    /**
     * 提交代码
     */
    @TableField("code")
    private String code;


}
