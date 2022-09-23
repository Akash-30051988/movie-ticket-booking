package org.movie.booking.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "seat")
public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "seat_id")
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(Integer seatNumber) {
        this.seatNumber = seatNumber;
    }

    public Auditorium getAuditorium() {
        return auditorium;
    }

    public void setAuditorium(Auditorium auditorium) {
        this.auditorium = auditorium;
    }

    public Set<SeatBooked> getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(Set<SeatBooked> bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

    public Seat() {
    }

    @Column(name = "seat_number")
    private Integer seatNumber;

    @ManyToOne
    @JoinColumn(name = "auditorium_id")
    @JsonManagedReference
    private Auditorium auditorium;

    @OneToMany(mappedBy = "seat", cascade = CascadeType.ALL)
    @JsonBackReference
    private Set<SeatBooked> bookedSeats;
}
