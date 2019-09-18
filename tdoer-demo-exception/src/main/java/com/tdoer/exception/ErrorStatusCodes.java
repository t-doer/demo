/*
 *
 *  Copyright 2017-2019 T-Doer (tdoer.com).
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 */
package com.tdoer.exception;
import com.tdoer.springboot.annotation.ReasonPhrase;
import com.tdoer.springboot.http.StatusCodes;

/**
 * @author conan (kly824968443@gmail.com)
 * @create 2019/9/18
 * @description
 */
public interface ErrorStatusCodes extends StatusCodes {

    @ReasonPhrase("服务器繁忙，请稍后再试")
    int SERVER_ERROR = 50001;
    @ReasonPhrase("参数{0}校验错误")
    int PARAM_SINGLE_VALID_FAIL = 50002;

}
