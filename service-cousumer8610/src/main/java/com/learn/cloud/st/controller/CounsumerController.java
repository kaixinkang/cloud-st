package com.learn.cloud.st.controller;

import com.learn.cloud.st.feign.FeignProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kaixin_k
 * @version 1.0
 * @title CounsumerController
 * @description
 * @date 2021/4/25 16:34
 */
@RestController
@ResponseBody
public class CounsumerController  {
    @Autowired
    private FeignProducerService feignProducerService;

    @GetMapping("/getProducer")
    public String getProducer(){
        return feignProducerService.getProducer();
    }
}
