package ru.gbp.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.gbp.demo.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}

