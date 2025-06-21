package ru.gbp.demo.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import ru.gbp.demo.model.OrderDTO;
import java.time.LocalDateTime;
import java.util.List;

@Service
@Repository
public class OrdersService {
    // TODO Внедрить ордер репозетори

//    public interface MyRepository extends JpaRepository<MyEntity, Long> {
//
//        @Query("SELECT e FROM MyEntity e ORDER BY e.someField ASC")
//        List<MyEntity> findAllSortedBySomeFieldAsc();
//
//        @Query("SELECT e FROM MyEntity e ORDER BY e.anotherField DESC")
//        List<MyEntity> findAllSortedByAnotherFieldDesc();
//    }

    public List<OrderDTO> getOrders() {
        return List.of(
                new OrderDTO(1L, 1F, 1, 2, LocalDateTime.now())
        );
    }
}
