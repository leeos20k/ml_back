package com.example.backend.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class SearchLandInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SLID")
    private Long slid;

    @ManyToOne
    @JoinColumn(name = "LID")
    private LandInfo landInfo;

    @ManyToOne
    @JoinColumn(name = "MID")
    private Member member;
}
