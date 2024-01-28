package de.aittr.g_31_2_cars.controllers;

import de.aittr.g_31_2_cars.domain.Car;
import de.aittr.g_31_2_cars.services.CarService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController {

    private CarService service;

    public CarController(CarService service) {
        this.service = service;
    }

    @GetMapping
    public List<Car> getAll() {
        return service.getAll();
    }

    @GetMapping("/date")
    public List<Car> getAllCrsSortedByDate() {
        return service.getAllCrsSortedByDate();
    }

    @GetMapping("/{id}")
    public Car getCarById(@RequestParam int id) {
        return service.getCarById(id);
    }

    @GetMapping("/by-date/{date}")
    public Car getCarByDate(@PathVariable  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate date) {
        return service.getCarByDate(date);
    }

    @DeleteMapping("/{id}")
    public void deleteCarById(@PathVariable int id) {
        service.deleteCarById(id);
    }
}
