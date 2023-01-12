package io.chenylnti.order.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    RestTemplate restTemplate;
    @GetMapping("/add")
    public String add(){
        System.out.println("下单成功");
        //String msg = restTemplate.getForObject("http://localhost:8011/stock/reduce", String.class);
        return "hello world";
    }
    @GetMapping("/get")
    @SentinelResource(value = "get",blockHandler = "flowBlockHandler")
    public String get(){
        return "get";
    }
    @GetMapping("/flow")
    @SentinelResource(value = "flow",blockHandler = "flowBlockHandler")
    public String flow(){
        return "normal";
    }
    public String flowBlockHandler(BlockException e){
        return "sentinel";
    }
}
