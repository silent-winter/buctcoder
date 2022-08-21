package com.buct.coder.model;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import java.util.Set;

import com.baomidou.mybatisplus.extension.handlers.JacksonTypeHandler;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 近期比赛信息
 * </p>
 *
 * @author xinzi
 * @since 2022-08-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName(value = "contest", autoResultMap = true)
public class Contest implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 开始时间
     */
    @TableField("start_time")
    private Date startTime;

    /**
     * 比赛标题
     */
    @TableField("title")
    private String title;

    /**
     * 比赛地址
     */
    @TableField("link")
    private String link;

    /**
     * 比赛来源
     */
    @TableField("source")
    private String source;

    /**
     * 比赛参加人数
     */
    @TableField("stu_count")
    private Integer stuCount;

    /**
     * 参赛学生信息
     */
    @TableField(value = "stu_ids", typeHandler = JacksonTypeHandler.class)
    private Set<Integer> stuIds;

    @TableField("create_time")
    private Date createTime;

    @TableField("update_time")
    private Date updateTime;

}
