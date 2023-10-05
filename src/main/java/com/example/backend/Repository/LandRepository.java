package com.example.backend.Repository;


import com.example.backend.Entity.LandInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LandRepository extends JpaRepository<LandInfo, Long> {
}