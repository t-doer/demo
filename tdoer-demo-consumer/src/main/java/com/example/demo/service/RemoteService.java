package com.example.demo.service;

import com.example.demo.dto.TestDto;
import com.example.demo.vo.TestVo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * RemoteService
 */
@FeignClient("demo-provider")
public interface RemoteService {

    @RequestMapping("/remote/call")
    public TestVo remoteCall(@RequestBody TestDto dto);
    
}