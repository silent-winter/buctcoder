package com.buct.coder.core.exception;

import com.buct.coder.facade.response.ApiResult;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Created with IntelliJ IDEA.
 *
 * @Description:
 * @Auther: xinzi
 * @Date: 2022/08/18/15:13
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ApiResult<String> handleException(Exception e){
        log.warn("handleException detected!", e);
        return ApiResult.fail(ApiResult.ERROR_SYSTEM, StringUtils.isNotBlank(e.getMessage()) ? e.getMessage() : ApiResult.ERROR_SYSTEM_MSG);
    }

}
