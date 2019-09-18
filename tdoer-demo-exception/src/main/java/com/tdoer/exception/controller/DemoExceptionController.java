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
 * conan
 * 2019/9/12 下午3:48
 **/
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
