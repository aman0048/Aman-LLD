package dev.aman.bookmyshow.models;

import dev.aman.bookmyshow.models.constant.ShowSeatStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ShowSeat extends BaseModel{
    private int price;
    @ManyToOne
    private Seat seat;
    @ManyToOne
    private Show show;
    @Enumerated(EnumType.STRING)
    private ShowSeatStatus showSeatStatus;
}

/*
SHOW  SEAT : COMBINATION OF THE PHYSICAL SEAT FOR A PARTICULAR SHOW
    T1 (SAME THEATRE SAME TEAM, CAN'T BE STORED IN TABLE IN TEH FORM OF THE TABLE]
    9 AM SHOW
    A A A B B

    12 NOON SHOW
    B B B B B

    3 PM SHOW
    A B B B A

    7 PM SHOW
    B A B A B

    SHOW
      1             [ (9AM, A), (12PM, B), (3PM, A), (7PM, B) ] --> IF WE DO THIS. IT WILL VIOLATE 1NF

WHAT WE WILL SAY
-> iS THE SEAT AVAILABLE FOR THE 9PM SHOW -> HERE WE ARE SPECIFYING WHICH SEAT FOR WHICH SHOW WE WANT TO
RESERVE

*/