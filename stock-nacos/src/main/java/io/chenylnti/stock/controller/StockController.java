package io.chenylnti.stock.controller;

import org.apache.skywalking.apm.toolkit.trace.Trace;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    @GetMapping("/reduce2")
    public String reduce2(){
        int a=1/0;
        return "reduce  "+port;
    }
}
