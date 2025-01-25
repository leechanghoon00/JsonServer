package org.example.json.repository;

import org.example.json.entity.JsonProperty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropertyRepository extends JpaRepository<JsonProperty, Long> {
}
