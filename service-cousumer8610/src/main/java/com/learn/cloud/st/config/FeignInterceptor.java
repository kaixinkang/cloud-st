package com.learn.cloud.st.config;


import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

/**
 * @author kaixin_k
 * @version 1.0
 * @title FeignInterceptor
 * @description
 * @date 2021/4/25 17:30
 */
@Component
public class FeignInterceptor implements RequestInterceptor {

    private final Logger logger = Logger.getLogger(FeignInterceptor.class.getCanonicalName());


    /**
     * 本方法每个请求都会调用，可以通过RequestTemplate上的方法加入数据或处理逻辑。
     * Called for every request. Add data using methods on the supplied {@link RequestTemplate}.
     *
     * @param template
     */
    @Override
    public void apply(RequestTemplate template) {
        byte[] body = template.body();
        String url = template.url();
        String method = template.method();
        logger.info("通过feign请求接口, method: " + method + ", url: " + url + ", body: " + (body == null ? "" : new String(body)));
    }
}
