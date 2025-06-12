package ru.gbp.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.gbp.demo.model.OrderDTO;
import ru.gbp.demo.service.OrdersService;

import java.util.List;

@RestController
@RequestMapping("/orders")

public class OrdersController {

    private final OrdersService ordersService;

    @GetMapping
    public List<OrderDTO> orders() {
        return ordersService.getOrders();
    }

    public OrdersController(OrdersService ordersService) {
        this.ordersService = ordersService;
    }
//    public ResponseEntity<List<Orders>> getOrders() {
//        return ResponseEntity.ok().body(ordersService.getAllOrders());
//    }
}