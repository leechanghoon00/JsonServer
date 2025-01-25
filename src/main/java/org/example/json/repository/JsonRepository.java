package org.example.json.repository;

import org.example.json.entity.JsonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JsonRepository extends JpaRepository<JsonEntity, Long> {

}
