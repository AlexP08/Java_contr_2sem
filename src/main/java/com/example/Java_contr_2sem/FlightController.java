package com.example.Java_contr_2sem;

import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import com.example.Java_contr_2sem.model.Flight;


/**
 * Контроллер маршрутов
 */
@RestController
public class FlightController {



    /**
     * Контроллер GET запроса по ссылке "/flight"
     * для получения информации о всех маршрутах
     * @param pageable параметр заглушка
     * @return возвращает страницу со всеми поездами из базы данных
     */
    @GetMapping("/flights")
    public Page<Flight> getAllRoute(Pageable pageable) {
        return (Page<Flight>) FlightService.getAll(pageable);
    }

    @GetMapping("/flights/{flightId}")
    public Long getFlightById(@PathVariable Long flightId) {
        return FlightService.getFlightById(flightId);
    }



    /**
     * Контроллер POST запроса по ссылке "/flights"
     * для добавления нового маршрута в базу данных

     */
    @PostMapping("/flights")
    public Flight addFlight(@Valid @RequestBody Flight flight) {
        return FlightService.save(flight);
    }

    /**
     * Контроллер PUT запроса по ссылке "/flight/{flightId }"
     * для изменения информации о существующем маршруте
     *
     * @param flightId параметр id поезда
     * @param flight   JSON новые данные о поезде
     * @return возвращает измененный класс поезда
     */
    @PutMapping("/trains/{trainId}")
    public Long updateTrain(@PathVariable Long flightId ,
                            @Valid @RequestBody Flight flight) {
        return FlightService.update(flightId, flight);
    }

    /**
     * Контроллер DELETE запроса по ссылке "/flights/{flightId}"
     * для удаления вагона из базы данных
     *
     * @param flightId  параметр id поезда
     * @return возвращает код статуса
     */
    @DeleteMapping("/flights/{flightId}")
    public Long deleteFlight(@PathVariable Long flightId ) {
        return RouteService.delete(flightId);
    }
}
