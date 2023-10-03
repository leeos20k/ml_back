package com.example.backend.Entity;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
public class Sunflower {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    private byte[] image;
}
