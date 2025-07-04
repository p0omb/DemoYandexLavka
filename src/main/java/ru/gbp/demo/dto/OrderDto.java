package ru.gbp.demo.dto;

import lombok.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@RequiredArgsConstructor
public class OrderDto {
    private final Long orderId;
    private final Float weight;
    private final Integer regions;
    private List<String> deliveryHours = new ArrayList<>();
    private final Integer cost;
    private final LocalDateTime completedTime;
}
