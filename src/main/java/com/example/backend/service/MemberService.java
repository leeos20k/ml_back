package com.example.backend.service;

import com.example.backend.Entity.Member;
import com.example.backend.Repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class MemberService {
    @Autowired
    MemberRepository memberRepository;

    public void save(Member member){
        memberRepository.save(member);
    }


}
