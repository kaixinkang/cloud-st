package com.learn.cloud.st.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kaixin_k
 * @version 1.0
 * @title ProducerController
 * @description
 * @date 2021/4/25 16:48
 */
@RestController
@ResponseBody
public class ProducerController {
    @Value("${server.port}")
    private String prot;

    @GetMapping("/getProducer")
    public String getProducer(){
        return prot;
    }

}
