package com.example.demo.controller;

import com.example.demo.vo.TestVo;
import com.example.demo.dto.TestDto;
import com.example.demo.service.RemoteService;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class LocalService {

    private static Logger logger = LoggerFactory.getLogger(LocalService.class);

    @Autowired
    private RemoteService remoteService;

    @RequestMapping("/local/call")
    public TestVo testRemoteCall(@RequestBody TestDto dto) {
        logger.info("local call args: {}", dto);
        return remoteService.remoteCall(dto);
    }
}