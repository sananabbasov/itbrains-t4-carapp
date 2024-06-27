package az.edu.itbrains.services.impls;

import az.edu.itbrains.models.Car;
import az.edu.itbrains.services.CarService;

public class CarServiceImpl implements CarService {


    @Override
    public void run(Car car, double km) {

        double fuelResult = km * car.getFuelPerMillage() / 100;

        if (car.getFuel() - fuelResult >= 0){
            double sumKm = car.getMillage() + km;
            car.setMillage(sumKm);
            double lastFuel = car.getFuel() - fuelResult;
            car.setFuel(lastFuel);
        }else {
            System.out.println("Sur yanacaqdoldurma menteqesine.");
        }
    }

    @Override
    public Car getInfo(Car car) {
        return car;
    }

    @Override
    public void fuelStation(Car car, int fuel) {
        boolean checkMax = car.getFuel()  + fuel > car.getMaxFuel();
        if (checkMax){
            System.out.println("Bu qeder benzin doldura bilmezsiniz.");
        }else{
            double sumFuel = car.getFuel()+fuel;
            car.setFuel(sumFuel);
        }
    }
}
