package org.movie.booking.service.impl;

import org.movie.booking.model.SeatBooked;
import org.movie.booking.repository.SeatBookedRepository;
import org.movie.booking.service.SeatBookedService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class SeatBookedServiceImpl implements SeatBookedService {
    private SeatBookedRepository seatBookedRepository;

    @Override
    public List<SeatBooked> getAllSeatBooked() {
        return seatBookedRepository.findAll();
    }

    @Override
    public SeatBooked getSeatBookedById(Long seat_booked_id) {
        return null;
    }

    @Override
    public SeatBooked pushSeatBooked(SeatBooked newSeatBooked) {
        return null;
    }

    @Override
    public SeatBooked updateSeatBooked(SeatBooked updatedSeatBooked, Long seat_booked_id) {
        return null;
    }

    @Override
    public void deleteSeatBookedById(Long seat_booked_id) {

    }
}
