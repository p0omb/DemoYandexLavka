package ru.gbp.demo.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;
import java.util.List;

@Entity
@Table(name = "couriers")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Courier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long courierId;

//    @Enumerated(EnumType.STRING)
//    private CourierType courierType;

    @ElementCollection
    @CollectionTable(name = "courier_regions", joinColumns = @JoinColumn(name = "courier_id"))
    @Column(name= "region")
    @NotEmpty(message = "Regions cannot be empty")
    private List<Integer> regions;

    @ElementCollection
    @CollectionTable(name = "courier_working_hours", joinColumns = @JoinColumn(name = "courier_id"))
    @Column(name = "working_hour")
    @NotEmpty(message = "Working hours cannot be empty")
    private List<String> workingHours;
}
