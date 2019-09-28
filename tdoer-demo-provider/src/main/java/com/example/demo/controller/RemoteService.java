package com.example.demo.controller;

import com.example.demo.vo.TestVo;
import com.example.demo.dto.TestDto;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class RemoteService {

    private static Logger logger = LoggerFactory.getLogger(RemoteService.class);

    @RequestMapping("/remote/call")
    public TestVo testRemoteCall(@RequestBody TestDto dto) {
        logger.debug("remote call args: {}", dto);
        return new TestVo("Response");
    }
}