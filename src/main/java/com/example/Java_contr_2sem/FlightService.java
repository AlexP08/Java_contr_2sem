package com.example.Java_contr_2sem;

import org.springframework.data.domain.Pageable;
import com.example.Java_contr_2sem.model.Flight;

public interface FlightService {

    static Flight save(Flight flight) {
        return flight;
    }

    static Long delete(Long id) {
        return id;
    }

    static Long update(Long id, Flight flight) {
        return id;
    }

    static Long getFlightById(Long flightId) {
        return flightId;
    }

    static Pageable getAll(Pageable pageable) {
        return pageable;
    }

    static String getFlightByName(String name) {
        return name;
    }
}

