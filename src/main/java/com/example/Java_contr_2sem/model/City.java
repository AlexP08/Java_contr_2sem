package com.example.Java_contr_2sem.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;

import java.util.Objects;

/**
 * Сущность городов в базе данных
 */
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "city")
public class City {

    /**
     * Поле Id сущности
     */
    @Id
    @GeneratedValue(generator = "city_generator")
    @SequenceGenerator(
            name = "city_generator",
            sequenceName = "city_sequence",
            initialValue = 1000
    )
    private Long id;

    /**
     * Поле имени города
     */
    @Column(columnDefinition = "text", unique = true)
    private String name;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        City city = (City) o;
        return Objects.equals(id, city.id);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
