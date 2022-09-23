package org.movie.booking.service.impl;

import org.movie.booking.exception.MovieNotFoundException;
import org.movie.booking.model.Movie;
import org.movie.booking.model.Screening;
import org.movie.booking.repository.MovieRepository;
import org.movie.booking.service.MovieService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Primary
public class MovieServiceImpl implements MovieService {
    private MovieRepository movieRepository;

    @Override
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    @Override
    public Movie getMovieById(Long movie_id) {
        return movieRepository.findById(movie_id).orElseThrow(() -> new MovieNotFoundException(movie_id));
    }

    @Override
    public Movie pushMovie(Movie newMovie) {
        return null;
    }

    @Override
    public Movie updateMovie(Movie updatedMovie, Long movie_id) {
        return null;
    }

    @Override
    public List<Screening> getAllScreeningByMovieId(Long movie_id) {
        Movie movie = getMovieById(movie_id);
        return new ArrayList<>(movie.getScreenings());
    }

    @Override
    public void deleteMovie(Long movie_id) {
        movieRepository.deleteById(movie_id);
    }

    @Override
    public List<Screening> getAllScreeningByMovieIdAndDate(Long movie_id, LocalDate date) {
        Movie movie = getMovieById(movie_id);
        return movie.getScreenings().stream().filter(screening -> screening.getDate().equals(date)).collect(Collectors.toList());
    }
}
