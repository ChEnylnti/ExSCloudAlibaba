package io.chenylnti.order.config;

import feign.Contract;
import feign.Logger;
import feign.Request;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//使用configuration会将配置作用所有的服务提供方
//局部就不要加configuration
@Configuration
public class FeignConfig {
    @Bean
    public Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
//    //修改契约配置，支持feign原生注解
//    @Bean
//    public Contract feignContract(){
//        return new Contract.Default();
//    }
    @Bean
    public Request.Options options(){
        return new Request.Options(5000,10000);
    }

}
