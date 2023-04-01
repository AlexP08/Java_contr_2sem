package com.example.Java_contr_2sem;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.Java_contr_2sem.model.City;

import java.util.List;

/**
 * Репозиторий городов
 */
@Repository
public interface CityRepository extends JpaRepository<City, Long> {
    City findByNameEquals(String name);
}