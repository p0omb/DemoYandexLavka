package ru.gbp.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;


import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;


public class OrderDTO {

    @JsonProperty("order_id")
    private Long orderId;

    @JsonProperty("weight")
    private Float weight;

    @JsonProperty("regions")
    private Integer regions;

    @JsonProperty("delivery_hours")

    private List<String> deliveryHours = new ArrayList<>();

    @JsonProperty("cost")

    private Integer cost;

    @JsonProperty("completed_time")
    private OffsetDateTime completedTime;

    // Конструкторы
    public OrderDTO(long l, float v, int i, String ndg, int i1) {
    }

    public OrderDTO(Long orderId, Float weight, Integer regions,
                    List<String> deliveryHours, Integer cost) {
        this.orderId = orderId;
        this.weight = weight;
        this.regions = regions;
        this.deliveryHours = deliveryHours;
        this.cost = cost;
    }

    public OrderDTO() {
        this.orderId = orderId;
        this.weight = weight;
        this.regions = regions;
        this.deliveryHours = deliveryHours;
        this.cost = cost;
        this.completedTime = completedTime;
    }

    // Гетеры и сетеры
    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Integer getRegions() {
        return regions;
    }

    public void setRegions(Integer regions) {
        this.regions = regions;
    }

    public List<String> getDeliveryHours() {
        return deliveryHours;
    }

    public void setDeliveryHours(List<String> deliveryHours) {
        this.deliveryHours = deliveryHours;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public LocalDateTime getCompletedTime() {
        return completedTime.toLocalDateTime();
    }

    public void setCompletedTime(OffsetDateTime completedTime) {
        this.completedTime = completedTime;
    }

    @Override
    public String toString() {
        return "OrderDTO{" +
                "orderId=" + orderId +
                ", weight=" + weight +
                ", regions=" + regions +
                ", deliveryHours=" + deliveryHours +
                ", cost=" + cost +
                ", completedTime=" + completedTime +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderDTO orderDto = (OrderDTO) o;

        return orderId != null ? orderId.equals(orderDto.orderId) : orderDto.orderId == null;
    }

    @Override
    public int hashCode() {
        return orderId != null ? orderId.hashCode() : 0;
    }
}