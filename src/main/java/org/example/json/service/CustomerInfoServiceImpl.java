package org.example.json.service;

import org.example.json.dto.CustomerInfoDTO;

// Service를 구현해 실제 데이터 반환
public class CustomerInfoServiceImpl implements CustomerInfoService {


    @Override
    public CustomerInfoDTO getCustomerInfo() {
        // DTO 객체 생성해 반환

        return new CustomerInfoDTO();
    }




}
