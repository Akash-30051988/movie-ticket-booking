package org.movie.booking.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name = "theatre")
public class Theatre {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "theatre_id")
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Auditorium> getAuditoriums() {
        return auditoriums;
    }

    public void setAuditoriums(Set<Auditorium> auditoriums) {
        this.auditoriums = auditoriums;
    }

    public Theatre() {
    }

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "theatre", cascade = CascadeType.ALL)
    @JsonBackReference
    private Set<Auditorium> auditoriums;
}
