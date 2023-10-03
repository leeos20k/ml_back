package com.example.backend.Repository;


import com.example.backend.Entity.Dandelion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DandelionRepository extends JpaRepository<Dandelion, Long> {
}