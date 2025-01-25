package org.example.json.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Entity
@Data
@Getter
@Setter
public class JsonEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long jsonId; // 시퀀스

    private String jsonTitle; // jsonTitle 필드

}
