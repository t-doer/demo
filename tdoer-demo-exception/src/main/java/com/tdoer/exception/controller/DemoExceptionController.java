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
package com.tdoer.exception.controller;

import com.tdoer.exception.bizz.DemoExceptionBizz;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author conan (kly824968443@gmail.com)
 * @create 2019/9/18
 * @description
 */
@Api(tags = "异常demo")
@RestController
@RequestMapping("demo")
@Slf4j
public class DemoExceptionController {

    @Autowired
    DemoExceptionBizz demoExceptionBizz;

    @ApiOperation(value = "异常")
    @GetMapping("exception")
    public void exception() {
        demoExceptionBizz.exception();
    }

    @ApiOperation(value = "注解异常")
    @GetMapping("annoException")
    public void annoException() {
        demoExceptionBizz.annoException();
    }
}
