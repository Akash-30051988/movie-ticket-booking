package org.movie.booking.exception;

public class AuditoriumNotFoundException extends RuntimeException {
    public AuditoriumNotFoundException(Long auditorium_id) {
    }
}
