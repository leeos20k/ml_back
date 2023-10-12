package com.example.backend.Repository;


import com.example.backend.Entity.LandInfo;
import com.example.backend.Entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
    // 이 인터페이스는 Member 엔티티와 상호 작용하기 위한 기본적인 CRUD(CREATE, READ, UPDATE, DELETE) 메소드를 제공합니다.

    // 사용자 이름과 전화번호를 이용하여 사용자를 찾는 메소드를 추가할 수 있습니다.
    Member findByMnameAndMtel(String mname, String mtel);

    Member findByMid(Long id);
    // 그 외 사용자와 관련된 커스텀 메소드를 필요에 따라 추가할 수 있습니다.
}

