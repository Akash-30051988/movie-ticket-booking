package org.movie.booking.service.impl;

import org.movie.booking.model.Seat;
import org.movie.booking.repository.SeatRepository;
import org.movie.booking.service.SeatService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class SeatServiceImpl implements SeatService {
    private SeatRepository seatRepository;

    @Override
    public List<Seat> getAllSeats() {
        return seatRepository.findAll();
    }

    @Override
    public Seat getSeatById(Long seat_id) {
        return null;
    }

    @Override
    public Seat pushSeat(Seat newSeat) {
        return null;
    }

    @Override
    public Seat updateSeat(Seat updatedSeat, Long seat_id) {
        return null;
    }

    @Override
    public void deleteSeatById(Long seat_id) {

    }
}
