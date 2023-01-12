package io.chenylnti.order.feign;

import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

//name指定服务名，path指定接口所在的requestMapping
@FeignClient(name = "stock-service",path = "/stock")
public interface StockFeignService {
    //声明需要调用的接口的方法
    @GetMapping("/reduce")
    public String reduce();
}
/*
*
@RestController
@RequestMapping("/stock")
public class StockController {
    @Value("${server.port}")
    String port;
    @GetMapping("/reduce")
    public String reduce(){
        System.out.println("扣减库存");
        return "reduce  "+port;
    }
}
* */