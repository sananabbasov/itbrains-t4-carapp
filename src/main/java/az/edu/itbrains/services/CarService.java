package az.edu.itbrains.services;

import az.edu.itbrains.models.Car;

public interface CarService {
    void run(Car car, double km);
    Car getInfo(Car car);
    void fuelStation(Car car, int fuel);
}
