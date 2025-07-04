package ru.gbp.demo.dto;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@RequiredArgsConstructor
public class CourierDto {
    private Integer courierId;
    private String courierType;
    private List<Integer> regions;
    private List<String> workingHours;
}
