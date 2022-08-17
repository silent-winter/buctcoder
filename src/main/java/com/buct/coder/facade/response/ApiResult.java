package com.buct.coder.facade.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description:
 * @Auther: xinzi
 * @Date: 2022/08/17/22:33
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiResult<T> {

    // 成功
    public static final String SUCCESS = "A00000";
    // 未知异常，系统错误
    public static final String ERROR_SYSTEM = "Q00500";
    // 输入参数错误
    public static final String ERROR_PARAM = "Q00301";
    // 没有权限
    public static final String NO_AUTH = "Q00403";
    // 数据库实例不存在
    public static final String ENTITY_ABSENT = "Q00404";

    public static final String SUCCESS_MSG = "success";
    public static final String ERROR_SYSTEM_MSG = "未知异常，系统错误";
    public static final String ENTITY_ABSENT_MSG = "数据库实例不存在";
    public static final String ERROR_PARAM_MSG = "输入参数错误";
    public static final String NO_AUTH_MSG = "输入参数错误";


    private Boolean success;

    private String code;

    private String msg;

    private T data;


    public static <T> ApiResult<T> success(T data) {
        return new ApiResult<>(true, ApiResult.SUCCESS, SUCCESS_MSG, data);
    }

    public static <T> ApiResult<T> fail() {
        return new ApiResult<>(false, ApiResult.ERROR_SYSTEM, ERROR_SYSTEM_MSG, null);
    }

    public static <T> ApiResult<T> fail(String msg) {
        return new ApiResult<>(false, ApiResult.ERROR_SYSTEM, msg, null);
    }

    public static <T> ApiResult<T> fail(String code, String msg) {
        return new ApiResult<>(false, code, msg, null);
    }

}
