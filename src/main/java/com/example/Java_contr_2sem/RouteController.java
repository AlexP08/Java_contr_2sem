package com.example.Java_contr_2sem;

import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import com.example.Java_contr_2sem.model.Route;


/**
 * Контроллер маршрутов
 */
@RestController
public class RouteController {



    /**
     * Контроллер GET запроса по ссылке "/routes"
     * для получения информации о всех маршрутах
     * @param pageable параметр заглушка
     * @return возвращает страницу со всеми аршрутами из базы данных
     */
    @GetMapping("/routes")
    public Page<Route> getAllRoute(Pageable pageable) {
        return RouteService.getAll(pageable);
    }

    @GetMapping("/routes/{routesId}")
    public Long getRouteById(@PathVariable Long routesId) {
        return RouteService.getRouteById(routesId);
    }



    /**
     * Контроллер POST запроса по ссылке "/routes"
     * для добавления нового маршрута в базу данных
     * @param route JSON данные о маршруте
     * @return возвращает сохраненный класс маршрута
     */
    @PostMapping("/routes")
    public Route addRoute(@Valid @RequestBody Route route) {
        return RouteService.save(route);
    }

    /**
     * Контроллер PUT запроса по ссылке "/route/{routeId}"
     * для изменения информации о существующем маршруте

     */
    @PutMapping("/routes/{routesId}")
    public Long updateRoute(@PathVariable Long routeId,
                            @Valid @RequestBody Route route) {
        return RouteService.update(routeId, route);
    }

    /**
     * Контроллер DELETE запроса по ссылке "/routes/{routeId}"
     * для удаления вагона из базы данных
     *
     * @param routeId параметр id поезда
     * @return возвращает код статуса
     */
    @DeleteMapping("/routes/{routeId}")
    public Long deleteRoute(@PathVariable Long routeId) {
        return RouteService.delete(routeId);
    }
}