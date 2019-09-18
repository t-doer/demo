package com.tdoer.exception;

import com.tdoer.springboot.annotation.ReasonPhrase;
import com.tdoer.springboot.http.StatusCodes;

/**
 * Declare customer error codes here, 41000 ~ 49999 for client-side bad request, and 51000~59999 for server-side internal error
 */
public interface ErrorStatusCodes extends StatusCodes {

    @ReasonPhrase("服务器繁忙，请稍后再试")
    int SERVER_ERROR = 50001;
    @ReasonPhrase("参数{0}校验错误")
    int PARAM_SINGLE_VALID_FAIL = 50002;

}
