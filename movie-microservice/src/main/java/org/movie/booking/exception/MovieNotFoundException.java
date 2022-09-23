package org.movie.booking.exception;

public class MovieNotFoundException extends RuntimeException {
    public MovieNotFoundException(Long movie_id) {
    }
}
