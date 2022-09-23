package org.movie.booking.exception;

public class SeatNotFoundException extends RuntimeException {
    public SeatNotFoundException(Integer seat_id) {
    }
}
