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
 * cf比赛题目信息
 * </p>
 *
 * @author xinzi
 * @since 2022-08-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("cf_problems")
public class CfProblems implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 比赛场次id
     */
    @TableField("contest_id")
    private Long contestId;

    /**
     * 比赛名字
     */
    @TableField("contest_name")
    private String contestName;

    /**
     * 问题下标（A、B、C）
     */
    @TableField("index")
    private String index;

    /**
     * 问题名字
     */
    @TableField("problem_name")
    private String problemName;

    /**
     * 问题标签
     */
    @TableField("tag")
    private String tag;

    @TableField("create_time")
    private Date createTime;

    @TableField("update_time")
    private Date updateTime;

}
