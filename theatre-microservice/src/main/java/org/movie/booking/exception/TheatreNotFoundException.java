package org.movie.booking.exception;

public class TheatreNotFoundException extends RuntimeException {
    public TheatreNotFoundException(Integer theatre_id) {
    }
}
