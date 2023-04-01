package com.example.Java_contr_2sem;


import com.example.Java_contr_2sem.model.City;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.Java_contr_2sem.model.Route;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/**
 * Репозиторий Маршрутов
 */
@Repository
public interface RouteRepository extends JpaRepository<Route, Long> {
    Route findByIDEquals(Long ID);

}