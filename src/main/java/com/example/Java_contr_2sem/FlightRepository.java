package com.example.Java_contr_2sem;

import com.example.Java_contr_2sem.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.Java_contr_2sem.model.Flight;

import java.util.List;

/**
 * Репозиторий полетов
 */
@Repository
public interface FlightRepository extends JpaRepository<City, Long> {
    Flight findByNameEquals(String name);
}