package org.movie.booking.service.impl;

import org.movie.booking.model.Booking;
import org.movie.booking.repository.BookingRepository;
import org.movie.booking.service.BookingService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class BookingServiceImpl implements BookingService {
    private BookingRepository bookingRepository;

    @Override
    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    @Override
    public Booking getBookingById(Long booking_id) {
        return null;
    }

    @Override
    public Booking pushBooking(Booking newBooking) {
        return null;
    }

    @Override
    public Booking updateBooking(Booking updatedBooking, Long booking_id) {
        return null;
    }

    @Override
    public void deleteBookingById(Long booking_id) {

    }
}

