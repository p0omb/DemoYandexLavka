package ru.gbp.demo.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "orders")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Long orderId;

    @Column(nullable = false)
    private Float weight;

    @Column(nullable = false)
    private Integer regions;


//    @Enumerated(EnumType.STRING)
//    private OrdersSource source;

    @ElementCollection
    @CollectionTable(name = "order_delivery_hours",
            joinColumns = @JoinColumn(name = "order_id"))
    @Column(name = "delivery_hour")
    private List<String> deliveryHours = new ArrayList<>();

    @Column(nullable = false)
    private Integer cost;

    @Column(name = "completed_time")
    private LocalDateTime completedTime;

//    Конструктор для создания из DTO
    public Orders(Float weight, Integer regions, List<String> deliveryHours, Integer cost) {
        this.weight = weight;
        this.regions = regions;
        this.deliveryHours = deliveryHours != null ? new ArrayList<>(deliveryHours) : new ArrayList<>();
        this.cost = cost;
    }
}