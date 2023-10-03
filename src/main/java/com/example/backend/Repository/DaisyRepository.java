package com.example.backend.Repository;

import com.example.backend.Entity.Daisy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DaisyRepository extends JpaRepository<Daisy, Long> {
}