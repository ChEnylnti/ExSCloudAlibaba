package io.chenylnti.order.service.impl;

import io.chenylnti.order.api.StockService;
import io.chenylnti.order.pojo.Order;
import io.chenylnti.order.service.OrderService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;

public class OrderServiceImpl implements OrderService {
    @Autowired
    StockService stockService;
    @GlobalTransactional
    @Override
    public Order create(Order order) {
//        stockService.reduce()
        return null;
    }
}
