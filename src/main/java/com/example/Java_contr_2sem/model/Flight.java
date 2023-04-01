package com.example.Java_contr_2sem.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import java.time.LocalTime;
import java.util.Objects;

/**
 * Сущность полеты
 */
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "flight")
public class Flight {

    /**
     * Поле Id сущности
     */
    @Id
    @GeneratedValue(generator = "flight_generator")
    @SequenceGenerator(
            name = "flight_generator",
            sequenceName = "flight_sequence",
            initialValue = 10
    )
    private Long id;

    /**
     * Поле имени города
     */
    @Column(columnDefinition = "text", unique = true)
    private String aviaName;

    /**
     * Поле времени вылета самолета
     */
    @Column(columnDefinition = "time")
    private LocalTime Datetime;

    /**
     * Поле времени вылета самолета
     */
    @Column(columnDefinition = "duration")
    private int Duration;


    /**
     * Неопциональное поле внешней связи между полетом и маршрутом
     * представляется в виде сущности {@link Route}
     */
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.NO_ACTION)
    @JsonIgnore
    @JoinColumn(columnDefinition = "depTrain")
    @ToString.Exclude
    private Route routeId;




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Flight flight = (Flight) o;
        return Objects.equals(id, flight.id);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
