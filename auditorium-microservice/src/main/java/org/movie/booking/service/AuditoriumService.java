package org.movie.booking.service;

import org.movie.booking.model.Auditorium;
import org.springframework.stereotype.Service;

import java.util.List;

public interface AuditoriumService {
   List<Auditorium> getAllAuditoriums();

    Auditorium getAuditoriumById(Long auditorium_id);

    Auditorium pushAuditorium(Auditorium newAuditorium);

    Auditorium updateAuditorium(Auditorium updatedAuditorium, Long auditorium_id);

    void deleteAuditoriumById(Long auditorium_id);
}
