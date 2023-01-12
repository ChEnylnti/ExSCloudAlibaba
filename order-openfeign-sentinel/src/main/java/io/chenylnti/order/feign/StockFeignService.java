package io.chenylnti.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "stock-nacos",path = "/stock",fallback = StockFeignServiceFallback.class)
public interface StockFeignService {
    @GetMapping("/reduce2")
    public String reduce2();
}
