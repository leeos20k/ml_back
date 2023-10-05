package com.example.backend.controller;

import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.ArrayList;

@RestController
@RequestMapping("/upload")
public class ImageController {
    @PostMapping
    public String uploadImage(@RequestParam("image") MultipartFile image, RestTemplate restTemplate) {
        if (image != null && !image.isEmpty()) {
            System.out.println("업로드된 이미지 이름: " + image.getOriginalFilename());

            // 이미지를 전송할 URL
            String uploadUrl = "http://localhost:8000/upload"; // 여기에 실제 엔드포인트를 넣으세요.

            // HTTP 헤더 설정
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.MULTIPART_FORM_DATA);

            // HTTP 요청 바디 설정
            MultiValueMap<String, Object> body = new LinkedMultiValueMap<>();
            body.add("image", image.getResource());

            // HTTP 요청 엔티티 생성
            HttpEntity<MultiValueMap<String, Object>> requestEntity = new HttpEntity<>(body, headers);

            // HTTP POST 요청 보내기
            ResponseEntity<String> response = restTemplate.exchange(uploadUrl, HttpMethod.POST, requestEntity, String.class);

            // 응답 출력 (옵션)
            System.out.println("응답 코드: " + response.getStatusCode());
            System.out.println("응답 본문: " + response.getBody());

            // 외부 폴더 경로 설정
            String externalFolderPath = "C:/image"; // 실제 경로로 변경해야 합니다.

            // 외부 폴더에서 파일 목록 가져오기
            ArrayList<String> flist = new ArrayList<>();
            File externalFolder = new File(externalFolderPath);
            if (externalFolder.exists() && externalFolder.isDirectory()) {
                File[] files = externalFolder.listFiles();
                if (files != null) {
                    for (File file : files) {
                        if (file.isFile()) {
                            System.out.println("파일: " + file.getName());
                        } else if (file.isDirectory()) {
                            System.out.println("폴더: " + file.getName());
                            flist.add(file.getName());
                        }
                    }
                } else {
                    System.err.println("폴더가 비어 있습니다.");
                }
            } else {
                System.err.println("폴더가 존재하지 않거나 폴더가 아닙니다.");
            }
            String filename = flist.get(Integer.parseInt(response.getBody()));
            System.out.println("filname = " + filename);


            return "이미지 전송 완료"; // 성공 시 응답
        } else {
            return "이미지를 선택하지 않았습니다.";
        }
    }
}
