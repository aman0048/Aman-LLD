package dev.aman.bookmyshow.models;

import dev.aman.bookmyshow.models.constant.AuditoriumFeature;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Auditorium extends BaseModel{
    private String name;
    private int capacity;
    @OneToMany
    private List<Show> shows;
    @OneToMany
    private List<Seat> seats;
    @ElementCollection // Used when Enum is in form of some collection like List, Set etc.
    @Enumerated(EnumType.STRING) // Creates a relationship between the entity class and the enum in DB
    private List<AuditoriumFeature> auditoriumFeatures;

}
