package io.chenylnti.order.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "stock-seata",path = "/stock")
public interface StockService {
    @GetMapping("/reduce")
    public String reduce(@RequestParam(value = "productId") Integer productId);
}
