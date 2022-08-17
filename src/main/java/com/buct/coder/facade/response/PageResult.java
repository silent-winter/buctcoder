package com.buct.coder.facade.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description:
 * @Auther: xinzi
 * @Date: 2022/08/17/22:39
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageResult<T> {

    /**
     * 总记录条数
     */
    private Long total;

    /**
     * 当前页
     */
    private Long current;

    /**
     * 每页条数
     */
    private Long size;

    /**
     * 查询到的记录
     */
    private List<T> records;

}
