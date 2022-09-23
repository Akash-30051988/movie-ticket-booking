package org.movie.booking.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name = "auditorium")
public class Auditorium {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "auditorium_id")
    private Long id;

    @Column(name = "seat_count")
    private Integer seatCount;

    public Auditorium() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(Integer seatCount) {
        this.seatCount = seatCount;
    }

    public Theatre getTheatre() {
        return theatre;
    }

    public void setTheatre(Theatre theatre) {
        this.theatre = theatre;
    }

    public Set<Seat> getSeats() {
        return seats;
    }

    public void setSeats(Set<Seat> seats) {
        this.seats = seats;
    }

    public Set<Screening> getScreenings() {
        return screenings;
    }

    public void setScreenings(Set<Screening> screenings) {
        this.screenings = screenings;
    }

    @ManyToOne
    @JoinColumn(name = "theatre_id")
    @JsonManagedReference
    private Theatre theatre;

    @OneToMany(mappedBy = "auditorium", cascade = CascadeType.ALL)
    @JsonBackReference
    private Set<Seat> seats;

    @OneToMany(mappedBy = "auditorium", cascade = CascadeType.ALL)
    @JsonBackReference
    private Set<Screening> screenings;
}
