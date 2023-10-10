package com.example.backend.service;

import com.example.backend.Entity.LandInfo;
import com.example.backend.Repository.LandRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class LandService {
    @Autowired
    private LandRepository landRepository;

    public LandInfo findAllByNameKo(String filename){

        return landRepository.findAllByNameKo(filename);
    }
}
