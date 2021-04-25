package com.learn.cloud.st.feign;

import com.learn.cloud.st.config.FeignInterceptor;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author kaixin_k
 * @version 1.0
 * @title FeignProducerService
 * @description
 * @date 2021/4/25 16:36
 */
@FeignClient(name="service-produver",configuration = FeignInterceptor.class)
public interface FeignProducerService {
    @RequestMapping("/getProducer")
    String getProducer();

}
