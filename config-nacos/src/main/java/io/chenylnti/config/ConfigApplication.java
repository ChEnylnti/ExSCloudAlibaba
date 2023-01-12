package io.chenylnti.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ConfigApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(ConfigApplication.class, args);
        String name = applicationContext.getEnvironment().getProperty("admin.name");
        String age = applicationContext.getEnvironment().getProperty("admin.pwd");
//        System.err.println("name: "+name+"; age: "+age);
        System.out.println("name: "+name+"; age: "+age);
    }
}
