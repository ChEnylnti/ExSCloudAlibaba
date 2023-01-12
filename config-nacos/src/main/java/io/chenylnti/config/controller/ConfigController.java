package io.chenylnti.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/admin")
@RefreshScope
public class ConfigController {
    @Value("${admin.name}")
    private String name;
    @Value("${admin.pwd}")
    private String pwd;
    @GetMapping("/getInfo")
    public Map<String,String> now(){
        Map<String, String> map = new HashMap<>();
        map.put("name",name);
        map.put("pwd",pwd);
        return map;
    }
}
