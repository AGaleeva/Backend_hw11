package de.aittr.g_31_2_cars.services;

import de.aittr.g_31_2_cars.domain.Car;
import de.aittr.g_31_2_cars.repositories.CarRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class CarService {

    private CarRepository repository;

    public CarService(CarRepository repository) {
        this.repository = repository;
    }

    public List<Car> getAll() {
        return repository.findAll();
    }

    public List<Car> getAllCrsSortedByDate() {
        Sort sortByDateAsc = Sort.by(Sort.Direction.ASC, "firstRegistration");
        return repository.findAll(sortByDateAsc);
    }

    public Car getCarById(int id) {
        return repository.getReferenceById(id);
    }

    /*public Car getCarByDate(LocalDate date) {
        return repository.getCarByDate(date);
    }*/

    public Car getCarByDate(LocalDate date) {
        return repository.findByFirstRegistration(date);
    }

    public void deleteCarById(int id) {
        repository.deleteCarById(id);
    }

}
