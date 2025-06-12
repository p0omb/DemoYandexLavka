package ru.gbp.demo.service;

import org.springframework.stereotype.Service;
import ru.gbp.demo.model.OrderDTO;

import java.util.List;

@Service
public class OrdersService {
    public List<OrderDTO> getOrders() {
        return List.of(
                new OrderDTO(1,3,4, String.valueOf(5),6)
        );
    }
}
