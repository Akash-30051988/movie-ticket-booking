package org.movie.booking.exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String user_id) {
    }
}
