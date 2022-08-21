package com.buct.coder.facade.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description:
 * @Auther: xinzi
 * @Date: 2022/08/18/9:27
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageRequest {

    private Integer page;
    private Integer size;

}
