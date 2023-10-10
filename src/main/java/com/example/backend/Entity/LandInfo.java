package com.example.backend.Entity;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
public class LandInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "LID")
    private Long lid; //관광지 id
    @Column(name = "NAME_KO",length = 100)
    private String nameKo; //관광지명

    @Column(name = "NAME_EN",length = 100)
    private String nameEn; //관광지명

    @Column(name = "MAIN_IMAGE",length = 500)
    private String mainImage; //대표 이미지
    @Column(name = "MAIN_IMAGE_PATH",length = 1000)
    private String mainImagePath;
    //====================서브 이미지 대략 5개====================
    @Column(name = "SUB_IMAGE1",length = 500)
    private String subimage1;
    @Column(name = "SUB_IMAGE1_PATH",length = 1000)
    private String subImage1Path;
    @Column(name = "SUB_IMAGE2",length = 500)
    private String subimage2;
    @Column(name = "SUB_IMAGE2_PATH",length = 1000)
    private String subImage2Path;
    @Column(name = "SUB_IMAGE3",length = 500)
    private String subimage3;
    @Column(name = "SUB_IMAGE3_PATH",length = 1000)
    private String subImage3Path;
    @Column(name = "SUB_IMAGE4",length = 500)
    private String subimage4;
    @Column(name = "SUB_IMAGE4_PATH",length = 1000)
    private String subImage4Path;
    @Column(name = "SUB_IMAGE5",length = 500)
    private String subimage5;
    @Column(name = "SUB_IMAGE5_PATH",length = 1000)
    private String subImage5Path;

    //====================서브 이미지 대략 5개====================

    @Column(name="ADDRESS_KO",length = 100)
    private String addressKo; //주소

    @Column(name="ADDRESS_EN",length = 100)
    private String addressEn; //주소

    @Column(name="TEL",length = 50)
    private String tel; //전화번호

    @Column(name="MAP_URL",length = 1000)
    private String mapUrl;

    @Lob // LOB (Large Object) 타입을 사용함을 나타냅니다.
    @Column(name="LINFO_KO",columnDefinition = "LONGTEXT")
    private String LinfoKo; //관광지 설명

    @Lob // LOB (Large Object) 타입을 사용함을 나타냅니다.
    @Column(name="LINFO_EN",columnDefinition = "LONGTEXT")
    private String LinfoEn; //관광지 설명


}
