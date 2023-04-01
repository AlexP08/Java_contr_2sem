package com.example.Java_contr_2sem;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import com.example.Java_contr_2sem.model.Route;

public interface RouteService {

    static Long getRouteById(Long routeId) {
        return routeId;
    }

    static Route save(Route route) {
        return route;
    }

    static Long delete(Long id) {
        return id;
    }

    static Long update(Long id, Route route) {
        return id;
    }


    static Page<Route> getAll(Pageable pageable) {
        return (Page<Route>) pageable;
    }

}
