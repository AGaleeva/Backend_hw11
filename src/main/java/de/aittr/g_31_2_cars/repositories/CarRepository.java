package de.aittr.g_31_2_cars.repositories;

import de.aittr.g_31_2_cars.domain.Car;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Query;
// import org.springframework.data.repository.query.Param;

import java.time.LocalDate;

public interface CarRepository extends JpaRepository<Car, Integer> {

   /* @Transactional
    @Query("SELECT c FROM Car c WHERE c.firstRegistration = :date")
    Car getCarByDate(@Param("date")LocalDate date);*/

    @Transactional
    Car findByFirstRegistration(LocalDate date);  // @Param("date")

    @Transactional
    void deleteCarById(int id);
}
