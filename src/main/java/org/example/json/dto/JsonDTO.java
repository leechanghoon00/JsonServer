package org.example.json.dto;


import lombok.Data;
import org.example.json.entity.JsonEntity;

import java.util.List;

@Data
public class JsonDTO {

    //DTO 생성
    private String jsonTitle; 
    private List<PropertyDTO> prpertyList;

    // DTO를 Entity로 변환
    public JsonEntity toEntity() {
        JsonEntity jsonEntity = new JsonEntity();
        jsonEntity.setJsonTitle(jsonTitle);

        return jsonEntity;

    }

}
