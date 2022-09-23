package org.movie.booking.service.impl;

import org.movie.booking.model.Theatre;
import org.movie.booking.repository.TheatreRepository;
import org.movie.booking.service.TheatreService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class TheatreServiceImpl implements TheatreService {
    private TheatreRepository theatreRepository;


    @Override
    public List<Theatre> getAllTheatres() {
        return theatreRepository.findAll();
    }

    @Override
    public Theatre getTheatreById(Long theatre_id) {
        return null;
    }

    @Override
    public Theatre pushTheatre(Theatre newTheatre) {
        return null;
    }

    @Override
    public Theatre updateTheatre(Theatre updatedTheatre, Long theatre_id) {
        return null;
    }

    @Override
    public void deleteTheatreById(Long theatre_id) {

    }
}
