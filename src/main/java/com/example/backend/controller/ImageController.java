package com.example.backend.controller;

import com.example.backend.Entity.Daisy;
import com.example.backend.Repository.DaisyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/upload")
public class ImageController {

    @Autowired
    private DaisyRepository daisyRepository;






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


            // 응답 본문이 0일 경우=데이지
            if ("0".equals(response.getBody())) {

                //이미지 데이터를 Daisy 엔티티에 저장
//                try {
//                    Daisy daisy = new Daisy();
//                    daisy.setImage(image.getBytes());
//                    daisyRepository.save(daisy);
//                    return "이미지가 성공적으로 업로드되었습니다.";
//                } catch (Exception e) {
//                    e.printStackTrace();
//                    return "이미지 업로드 중 오류가 발생했습니다.";
//                }
                System.out.println("판별완료되었으므로 이미지를 저장하려는데 크기가 너무 커서 안되는 문제");
                System.out.println("이제 데이지의 상세정보를 리액트로 보내서 출력해야함");
            }

            //응답 본문이 1일 경우=민들레
            else if ("1".equals(response.getBody())) {
            }

            //응답 본문이 2일 경우=장미
            else if ("2".equals(response.getBody())) {
            }

            //응답 본문이 3일 경우=해바라기
            else if ("3".equals(response.getBody())) {
            }

            //응답 본문이 4일 경우=튤립
            else if ("4".equals(response.getBody())) {
            }


            return "이미지 전송 완료"; // 성공 시 응답
        } else {
            return "이미지를 선택하지 않았습니다.";
        }
    }
}
