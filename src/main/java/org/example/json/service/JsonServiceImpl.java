package org.example.json.service;

import org.example.json.dto.JsonDTO;
import org.example.json.dto.PropertyDTO;
import org.example.json.entity.JsonEntity;
import org.example.json.repository.JsonRepository;
import org.example.json.repository.PropertyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JsonServiceImpl implements JsonService{

    private final JsonRepository jsonRepository;
    private final PropertyRepository propertyRepository;

    public JsonServiceImpl(JsonRepository jsonRepository, PropertyRepository propertyRepository) {
        this.jsonRepository = jsonRepository;
        this.propertyRepository = propertyRepository;
    }


    public void CreateJson(JsonDTO jsonDTO) {

        JsonEntity jsonEntity = jsonDTO.toEntity(); //JsonDTO를 Entity로 변환
        JsonEntity save = jsonRepository.save(jsonEntity); //변환된 Entity를 데이터베이스에 저장


        List<PropertyDTO> propertyDTOList = jsonDTO.getPrpertyList(); //DTO에서 Property를 리스트 형태로 가져옴

        for (int i=0 ; i<propertyDTOList.size() ; i++) { // 리스트가 몇개있는지 모르니까 계속 Entity로 변환하여 데이터 베이스에 저장
            PropertyDTO prpertyDTO = propertyDTOList.get(i);
            propertyRepository.save(prpertyDTO.toEntity(save));
        }


    }


}
