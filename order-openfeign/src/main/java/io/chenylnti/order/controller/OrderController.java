package io.chenylnti.order.controller;

import io.chenylnti.order.feign.StockFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    StockFeignService stockFeignService;
    @GetMapping("/add")
    public String add(){
        System.out.println("δΈεζε");
        String msg = stockFeignService.reduce();
        return "hello feign"+msg;
    }
}
