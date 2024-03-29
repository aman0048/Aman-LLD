package dev.aman.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity(name = "Movie_Shows")
public class Show extends BaseModel{
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    @ManyToOne
    private Movie movie;
    @ManyToOne
    private Auditorium auditorium;
    @OneToMany
    private List<ShowSeat> showSeat;

    /*
    *   Shows           Movie
    *      1               1 (1 show at any given time can display only one movie)
    *      M               1 (1 Movie can be played at multiple shows)
    *
    *      Shows           Auditorium
     *      1               1 (1 show can run only at 1 Audi)
     *      M               1 (1 Audi can be run multiple shows)
    * */
}
