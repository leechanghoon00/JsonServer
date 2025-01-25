package org.example.json.service;

import org.example.json.dto.CustomerInfoDTO;
import org.springframework.stereotype.Service;

@Service
public interface CustomerInfoService {
    // 고객정보 반환
    CustomerInfoDTO getCustomerInfo();



}
