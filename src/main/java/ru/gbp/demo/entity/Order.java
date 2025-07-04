package ru.gbp.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import lombok.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "order")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Integer orderId;

    @Column(nullable = false)
    @Positive(message = "Weight must be positive")
    private Float weight;

    @Column(nullable = false)
    @Positive(message = "Region must be positive")
    private Integer regions;

    @ElementCollection
    @CollectionTable(name = "order_delivery_hours", joinColumns = @JoinColumn(name = "order_id"))
    @Column(name = "delivery_hours")
    @NotEmpty(message = "Delivery hours cannot be empty")
    private List<String> deliveryHours = new ArrayList<>();

    @Column(nullable = false)
    @Positive(message = "Cost must be positive")
    private Integer cost;

//    @Column(name = "completed_time")
//    private LocalDateTime completedTime;

//    @Column(name = "assigned_courier_id")
//    private Long assignedCourierId;;

    //    Конструктор для создания из DTO
    public Order(Float weight, Integer regions, List<String> deliveryHours, Integer cost) {
        this.weight = weight;
        this.regions = regions;
        this.deliveryHours = deliveryHours != null ? new ArrayList<>(deliveryHours) : new ArrayList<>();
        this.cost = cost;
    }
}