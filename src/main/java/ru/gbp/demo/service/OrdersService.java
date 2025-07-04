package ru.gbp.demo.service;

//import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.jaxb.SpringDataJaxb;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import ru.gbp.demo.dto.OrderDto;
import ru.gbp.demo.repository.OrderRepository;
import ru.gbp.demo.entity.Order;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
//@Repository
public class OrdersService {
    @Autowired
    private OrderRepository orderRepository;

    //Получение заказов из БД
    public List<OrderDto> getOrders() {

        // 1)Получение всех сущностей из БД
        List<Order> orderFromDB = orderRepository.findAll();

        // 2)Конвертация каждой сущности в DTO
        return orderFromDB.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }
    //Конвертация Сущности в DTO
    private OrderDto convertToDto(Order orderEntity) {
        return new OrderDto(
                orderEntity.getOrderId(),
                orderEntity.getWeight(),
                orderEntity.getRegions(),
                orderEntity.getDeliveryHours(),
                orderEntity.getCost(),
                orderEntity.getCompletedTime()
        );
    }


    //Тестовые данные
    public List<OrderDto> getOrdersTest() {
        return List.of(
                new OrderDto(1L, 1F, 1, List.of("15:12-16:12"), 1, LocalDateTime.now()),
                new OrderDto(341244L, 4.321F, 54, List.of("12:30-14:50"), 8790, LocalDateTime.now())
        );
    }
}
