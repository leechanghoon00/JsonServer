package org.example.json.service;

import org.example.json.dto.JsonDTO;
import org.springframework.stereotype.Service;

@Service
public interface JsonService {

    // Json만들기(DTO를 Entity로)
    public void CreateJson(JsonDTO jsonDTO);
}
