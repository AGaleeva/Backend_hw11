package de.aittr.g_31_2_cars.domain;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "car")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "car_brand")
    private String brand;

    @Column(name = "car_model")
    private String model;

    @Column(name = "first_registration")
    private LocalDate firstRegistration;

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public LocalDate getFirstRegistration() {
        return firstRegistration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return id == car.id && Objects.equals(brand, car.brand) && Objects.equals(model, car.model) && Objects.equals(firstRegistration, car.firstRegistration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, brand, model, firstRegistration);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("id=").append(id);
        sb.append(", brand='").append(brand).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", firstRegistration=").append(firstRegistration);
        sb.append('}');
        return sb.toString();
    }
}
