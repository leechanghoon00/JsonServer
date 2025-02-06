package org.example.json.controller;

import org.example.json.dto.CustomerInfoDTO;
import org.example.json.dto.JsonDTO;
import org.example.json.service.CustomerInfoService;
import org.example.json.service.CustomerInfoServiceImpl;
import org.example.json.service.JsonService;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class CustomerInfoController {




    // CustomerinfoService를 통해 로직 처리
    private final CustomerInfoService customerInfoService;
    private final JsonService jsonService;

    // 생성자를 통해 CustomerinfoServiceImpl을 초기화
    public CustomerInfoController(JsonService jsonService) {
        this.jsonService = jsonService;
        this.customerInfoService = new CustomerInfoServiceImpl();


    }

    // api/info 경로로 들어오는 GET 요청
    @GetMapping("/info")
    public CustomerInfoDTO getCustomerInfo() {
        // CustomerInfoService를 호출해 정보 반환
        return customerInfoService.getCustomerInfo();
    }

    @PostMapping("/json")
    public void createJson(@RequestBody JsonDTO jsonDTO){


        jsonService.CreateJson(jsonDTO);
    }





}
