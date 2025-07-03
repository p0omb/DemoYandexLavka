package ru.gbp.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.jaxb.SpringDataJaxb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import ru.gbp.demo.model.OrderDTO;
import ru.gbp.demo.repository.OrderRepository;

import java.time.LocalDateTime;
import java.util.List;

@Service
//@Repository
public class OrdersService {
    @Autowired
    private OrderRepository orderRepository;

    public List<OrderDTO> getOrders() {
        return List.of(
                new OrderDTO(1L, 1F, 1, List.of("15:12-16:12"), 1, LocalDateTime.now()),
                new OrderDTO(3412144L, 4.321F, 54, List.of("12:30-14:50"), 8790, LocalDateTime.now())
        );
    }
}
