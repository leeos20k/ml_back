package com.example.backend.controller;

import com.example.backend.Entity.Member;
import com.example.backend.Repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/login")
public class LoginController {

    private final MemberRepository memberRepository;

    @Autowired
    public LoginController(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @PostMapping
    public Member loginUser(@RequestBody Member member) {
        String username = member.getMname();
        String tel = member.getMtel();


        System.out.println(username);
        System.out.println(tel);
        // 데이터베이스에서 사용자 확인
        Member existingMember = memberRepository.findByMnameAndMtel(username, tel);
        System.out.println(existingMember);
        String midValue = String.valueOf(existingMember.getMid());
        System.out.println(midValue);
//        if (midValue != null) {
//            // 사용자가 존재하면 성공적인 로그인 응답
//
//        }
        return existingMember;
    }
}
