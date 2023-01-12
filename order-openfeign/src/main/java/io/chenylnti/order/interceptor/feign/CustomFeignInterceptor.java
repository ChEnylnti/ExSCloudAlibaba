package io.chenylnti.order.interceptor.feign;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomFeignInterceptor implements RequestInterceptor {
    public final static Logger logger = LoggerFactory.getLogger(CustomFeignInterceptor.class);
    @Override
    public void apply(RequestTemplate template) {
        template.header("xxx","xxx");
        template.query("id","111");

        logger.info("feign拦截器");
    }
}
