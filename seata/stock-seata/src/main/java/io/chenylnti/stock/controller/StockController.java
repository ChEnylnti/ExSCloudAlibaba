package io.chenylnti.stock.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stock")
public class StockController {
    @GetMapping("/reduce")
    public String reduce(@RequestParam(value = "productId") Integer productId){
        System.out.println("扣减库存");

        return "reduce";
    }
    @GetMapping("/reduce2")
    public String reduce2(){
        int a=1/0;
        return "reduce  ";
    }
}
