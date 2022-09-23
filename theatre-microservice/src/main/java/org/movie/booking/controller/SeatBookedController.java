package org.movie.booking.controller;

import org.movie.booking.model.SeatBooked;
import org.movie.booking.service.SeatBookedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SeatBookedController {
    private SeatBookedService seatBookedService;

    @Autowired
    public SeatBookedController(SeatBookedService seatBookedService) {
        this.seatBookedService = seatBookedService;
    }

    @GetMapping("/seatbooked")
    public List<SeatBooked> getAllSeatBooked() {
        return seatBookedService.getAllSeatBooked();
    }
}
