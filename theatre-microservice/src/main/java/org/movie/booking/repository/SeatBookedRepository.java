package org.movie.booking.repository;

import org.movie.booking.model.SeatBooked;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeatBookedRepository extends JpaRepository<SeatBooked, Long> {
}
