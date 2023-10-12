package com.example.backend.Repository;


import com.example.backend.Entity.LandInfo;
import com.example.backend.Entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {

}