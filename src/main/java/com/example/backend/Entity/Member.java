package com.example.backend.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MID")
    private Long mid;

    @Column(name="TEL",length = 50)
    private String mtel;

    @Column(name="MNAME",length = 100)
    private String mname;
}
