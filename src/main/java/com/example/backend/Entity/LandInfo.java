package com.example.backend.Entity;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
public class LandInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tid; //관광지 id

    @Column(length = 100)
    private String nameko; //관광지명

    @Column(length = 100)
    private String nameen; //관광지명

    @Column(length = 500)
    private String mainimage; //대표 이미지

    //====================서브 이미지 대략 5개====================
    @Column(length = 500)
    private String subimage1;
    @Column(length = 500)
    private String subimage2;
    @Column(length = 500)
    private String subimage3;
    @Column(length = 500)
    private String subimage4;
    @Column(length = 500)
    private String subimage5;
    //====================서브 이미지 대략 5개====================

    @Column(length = 100)
    private String addressko; //주소

    @Column(length = 100)
    private String addressen; //주소

    @Column(length = 50)
    private String tel; //전화번호

    @Column(length = 1000)
    private String mapurl;

    @Lob // LOB (Large Object) 타입을 사용함을 나타냅니다.
    @Column(columnDefinition = "LONGTEXT")
    private String tinfoko; //관광지 설명

    @Lob // LOB (Large Object) 타입을 사용함을 나타냅니다.
    @Column(columnDefinition = "LONGTEXT")
    private String tinfoen; //관광지 설명


}
