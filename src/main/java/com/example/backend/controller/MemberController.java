package com.example.backend.controller;

import com.example.backend.Entity.Member;
import com.example.backend.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {
    @Autowired
    MemberService memberService;

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody Member member) {
        System.out.println(member.getMname());
        System.out.println(member.getMtel());
        memberService.save(member);
        return ResponseEntity.ok("사용자가 성공적으로 등록되었습니다.");
    }
}
