package com.project.moviereview.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "movie")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String director;

    @Column(nullable = false)
    private String genre;
}
