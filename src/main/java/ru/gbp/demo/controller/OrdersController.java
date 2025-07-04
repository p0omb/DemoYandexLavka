package ru.gbp.demo.controller;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.gbp.demo.dto.OrderDto;
import ru.gbp.demo.service.OrdersService;
import java.util.List;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
@AllArgsConstructor
public class OrdersController {

    private final OrdersService ordersService;

    @GetMapping
    public List<OrderDto> orders() {
      return ordersService.getOrdersTest();
    }
//    public ResponseEntity<List<Orders>> getOrders() {
//        return ResponseEntity.ok().body(ordersService.getAllOrders());
//    }
}