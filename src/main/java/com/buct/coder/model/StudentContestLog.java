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
 * 学生比赛记录
 * </p>
 *
 * @author xinzi
 * @since 2022-08-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("student_contest_log")
public class StudentContestLog implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 比赛id
     */
    @TableField("contest_id")
    private Long contestId;

    /**
     * 老排名
     */
    @TableField("old_rank")
    private Integer oldRank;

    /**
     * 新排名
     */
    @TableField("new_rank")
    private Integer newRank;

    /**
     * 排名变化
     */
    @TableField("diff")
    private String diff;

    /**
     * 解决数
     */
    @TableField("solve")
    private Integer solve;

    @TableField("create_time")
    private Date createTime;

    @TableField("update_time")
    private Date updateTime;


}
