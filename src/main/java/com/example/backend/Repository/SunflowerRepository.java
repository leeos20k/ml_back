package com.example.backend.Repository;

import com.example.backend.Entity.Sunflower;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SunflowerRepository extends JpaRepository<Sunflower, Long> {
}