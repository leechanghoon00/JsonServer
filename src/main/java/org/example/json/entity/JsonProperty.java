package org.example.json.entity;

import jakarta.persistence.*;

import lombok.Data;


@Entity
@Data
public class JsonProperty {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long propertyId; //시퀀스

    @ManyToOne //많은 것이 하나(JsonEntity를 참조하기에 OneToMany가 아니라 ManyToOne사용)
    private JsonEntity jsonEntity; // 어떤 타이틀의 글인지 알기위해 참조

    private String keyName;
    private String valueData;
    private String type;

}
