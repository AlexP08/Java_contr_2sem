package com.example.Java_contr_2sem;

import org.springframework.data.domain.Pageable;
import com.example.Java_contr_2sem.model.City;

public interface CityService {

    static City save(City city) {
        return city;
    }

    static Long delete(Long id) {
        return id;
    }

    static Long update(Long id, City city) {
        return id;
    }

    City getCityById(Long id);

    static Pageable getAll(Pageable pageable) {
        return pageable;
    }

    static String getCityByName(String name) {
        return name;
    }
}
