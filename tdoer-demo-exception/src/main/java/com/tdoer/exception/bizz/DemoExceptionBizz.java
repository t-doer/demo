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
package com.tdoer.exception.bizz;

import com.tdoer.springboot.error.BusinessException;
import com.tdoer.exception.ErrorStatusCodes;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author conan (kly824968443@gmail.com)
 * @create 2019/9/18
 * @description
 */
@Component
@Slf4j
public class DemoExceptionBizz {

    public void exception() {
        log.info("demo throw exception");
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
