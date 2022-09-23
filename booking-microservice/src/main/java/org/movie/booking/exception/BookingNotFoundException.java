package org.movie.booking.exception;

public class BookingNotFoundException extends RuntimeException {
    public BookingNotFoundException(Long booking_id) {
    }
}
