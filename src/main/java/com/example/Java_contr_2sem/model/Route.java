package com.example.Java_contr_2sem.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.Objects;

/**
 * Сущность рейсов
 */
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "route")
public class Route {

    /**
     * Поле Id сущности
     */
    @Id
    @GeneratedValue(generator = "route_generator")
    @SequenceGenerator(
            name = "route_generator",
            sequenceName = "route_sequence",
            initialValue = 10
    )
    private Long id;


    /**
     * Неопциональное поле внешней связи между маршрутом и городом отправления
     * представляется в виде сущности {@link City}
     */
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.NO_ACTION)
    @JsonIgnore
    @JoinColumn(columnDefinition = "cityFrom")
    @ToString.Exclude
    private City cityFrom;

    /**
     * Неопциональное поле внешней связи между маршрутом и городом прибытия
     * представляется в виде сущности {@link City}
     */
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.NO_ACTION)
    @JsonIgnore
    @JoinColumn(columnDefinition = "cityTo")
    @ToString.Exclude
    private City cityTo;



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Route route = (Route) o;
        return Objects.equals(id, route.id);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
