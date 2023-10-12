package com.example.backend.Repository;


import com.example.backend.Entity.LandInfo;
import com.example.backend.Entity.SearchLandInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SearchLandInfoRepository extends JpaRepository<SearchLandInfo, Long> {
    void deleteBySlid(Long slid);
}