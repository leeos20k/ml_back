package com.example.backend.service;

import com.example.backend.Entity.SearchLandInfo;
import com.example.backend.Repository.SearchLandInfoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class SearchLandinfoService {

    @Autowired
    SearchLandInfoRepository searchLandInfoRepository;

    public void save(SearchLandInfo searchLandInfo){
        searchLandInfoRepository.save(searchLandInfo);
    }

    public List<SearchLandInfo> findAll(){
        return searchLandInfoRepository.findAll();
    }
}
