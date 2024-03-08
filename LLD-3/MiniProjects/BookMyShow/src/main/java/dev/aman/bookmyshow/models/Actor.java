package dev.aman.bookmyshow.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity (name = "ACTOR")
public class Actor extends BaseModel{
    @Column(name = "ACTOR_NAME")
    private String name;
    @ManyToMany
    private List<Movie> movies;
}
