package ru.gbp.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.gbp.demo.entity.Orders;
import ru.gbp.demo.enums.OrdersSource;

import java.util.List;

@Repository
public interface OrdersDao extends JpaRepository<Orders, Long> {
    List<Orders> findAllBySourceAndProcessedFalse(OrdersSource source);
}

