package com.example.backend.Repository;


import com.example.backend.Entity.Tulip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TulipRepository extends JpaRepository<Tulip, Long> {
}