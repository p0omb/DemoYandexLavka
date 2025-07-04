package ru.gbp.demo.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateCourierDto {
    @NotNull
    private CourierType courierType;

    @NotNull
    @NotEmpty
    private List<Integer> regions;

    @NotNull
    @NotEmpty
    private List<String> workingHours;
}
