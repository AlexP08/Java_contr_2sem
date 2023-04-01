package com.example.Java_contr_2sem;

import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import com.example.Java_contr_2sem.model.City;


/**
 * Контроллер городов
 */
@RestController
public class CityController {



    /**
     * Контроллер GET запроса по ссылке "/cities"
     * для получения информации о всех городах
     * @param pageable параметр заглушка
     * @return возвращает страницу со всеми городами из базы данных
     */
    @GetMapping("/cities")
    public Page<City> getAllCities(Pageable pageable){
        return (Page<City>) CityService.getAll(pageable);
    }

    /**
     * Контроллер GET запроса по ссылке "/cities/{name}"
     * для полученя информации города по его имени
     *
     * @param name название города
     * @return возвращает класс города по заданному имени
     */
    @GetMapping("/cities/{name}")
    public String getCityByName(@PathVariable String name) {
        return CityService.getCityByName(name);
    }

    /**
     * Контроллер POST запроса по ссылке "/cities"
     * для добавления нового города в базе данных
     * @param city JSON данные о городе
     * @return возвращает сохраненный класс города
     */
    @PostMapping("/cities")
    public City addCity(@Valid @RequestBody City city) {
        return CityService.save(city);
    }

    /**
     * Контроллер PUT запроса по ссылке "cities/{cityId}"
     * для изменения информации о существующем городе
     *
     * @param cityId параметр id города
     * @param city   JSON новые данные о городе
     * @return возвращает измененный класс города
     */
    @PutMapping("/cities/{cityId}")
    public Long updateCity(@Valid @PathVariable Long cityId,
                           @Valid @RequestBody City city) {
        return CityService.update(cityId, city);
    }

    /**
     * Контроллер DELETE запроса по ссылке "cities/{cityId}"
     * для удаления города из базы данных
     *
     * @param cityId параметр id города
     * @return возвращает код статуса
     */
    @DeleteMapping("/cities/{cityId}")
    public Long deleteCity(@Valid @PathVariable Long cityId) {
        return CityService.delete(cityId);
    }
}
