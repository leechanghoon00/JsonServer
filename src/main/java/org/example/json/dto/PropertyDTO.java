package org.example.json.dto;


import lombok.Getter;
import lombok.Setter;
import org.example.json.entity.JsonEntity;
import org.example.json.entity.JsonProperty;

@Getter
@Setter
public class PropertyDTO {


    // PropertyDTO 생성
    private String keyName;
    private String valueData;
    private String type;

    // JsonEntity를 받아와서 라는 타입의 객체를 받아와서 내부에서 사용
    public JsonProperty toEntity(JsonEntity jsonEntity) {
        JsonProperty property = new JsonProperty();
        // jsonEntity 객체를 property 객체에 설정
        property.setJsonEntity(jsonEntity);
        property.setKeyName(keyName);
        property.setValueData(valueData);
        property.setType(type);

        return property;


    }
}
