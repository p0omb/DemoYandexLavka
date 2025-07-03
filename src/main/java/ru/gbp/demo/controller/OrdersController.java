package ru.gbp.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.gbp.demo.model.OrderDto;
import ru.gbp.demo.service.OrdersService;
import java.util.List;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrdersController {

    private final OrdersService ordersService;

    @GetMapping
    public List<OrderDto> orders() {
      return ordersService.getOrdersTest();
    }
////    GET /couriers
//    @GetMapping(produces = APPLICATION_JSON_VALUE)
//    public List<courierResponce> findAll() {
//        return userService.findAll();
//    }
////    GET /couriers/{courier_id}
//    @GetMapping(value = "/{courier_Id}", produces = APPLICATION_JSON_VALUE)
//    public UserResponse findById(@PathVariable Integer userId) {
//        return userService.findById(userId);
    }

//    public ResponseEntity<List<Orders>> getOrders() {
//        return ResponseEntity.ok().body(ordersService.getAllOrders());
//    }
//}