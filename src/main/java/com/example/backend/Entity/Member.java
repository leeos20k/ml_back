package com.example.backend.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MID")
    private Long mid;

    @Column(name = "TEL", length = 50)
    private String mtel;

    @Column(name = "MNAME", length = 100)
    private String mname;

    //    @Column(name = "ROLE",length = 30, columnDefinition = "VARCHAR(30) default 'USER'")
//    private String role;
    @Column(name = "ROLE", length = 50)
    private String role = "USER"; // 기본값으로 "user"를 설정

    @PrePersist
    public void prePersist() {
        // 이 메서드는 엔티티가 영구 저장되기 전에 호출됩니다.
        // 원하는 고정 값을 설정할 수 있습니다.
        this.role = "USER";
    }
}
