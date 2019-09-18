package com.tdoer.exception.bizz;

import com.tdoer.springboot.error.BusinessException;
import com.tdoer.exception.ErrorStatusCodes;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * conan
 * 2019/9/12 下午3:48
 **/
@Component
public class DemoExceptionBizz {

    public void exception() {
        if (new Date().getTime() % 2 == 0) {
            throw new BusinessException("业务异常,请稍后再试",1001);
        }
        if (new Date().getTime() % 2 == 1) {
            throw new RuntimeException("系统异常");
        }
    }

    public void annoException() {
        throw new BusinessException(ErrorStatusCodes.PARAM_SINGLE_VALID_FAIL,"userId");
    }
}
