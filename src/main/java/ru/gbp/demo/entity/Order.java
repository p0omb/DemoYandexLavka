package ru.gbp.demo.entity;


import jakarta.persistence.*;
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
    private Float weight;

    @Column(nullable = false)
    private Integer regions;

    @ElementCollection
    @CollectionTable(name = "order_delivery_hours",
            joinColumns = @JoinColumn(name = "order_id"))
    @Column(name = "delivery_hours")
    private List<String> deliveryHours = new ArrayList<>();

    @Column(nullable = false)
    private Integer cost;

//    @Column(name = "completed_time")
//    private LocalDateTime completedTime;

//    @Column(name = "assiwgned_courier_id")
//    private Long assignedCourierId;;


    //    Конструктор для создания из DTO
    public Order(Float weight, Integer regions, List<String> deliveryHours, Integer cost) {
        this.weight = weight;
        this.regions = regions;
        this.deliveryHours = deliveryHours != null ? new ArrayList<>(deliveryHours) : new ArrayList<>();
        this.cost = cost;
    }
}