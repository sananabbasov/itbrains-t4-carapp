package az.edu.itbrains;

import az.edu.itbrains.models.Car;
import az.edu.itbrains.services.CarService;
import az.edu.itbrains.services.impls.CarServiceImpl;

import java.util.Scanner;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Car nissan = new Car();
        nissan.setId(1);
        nissan.setModel("Patrol");
        nissan.setBrand("Nissan");
        nissan.setMillage(0);
        nissan.setFuel(75);
        nissan.setMaxFuel(80);
        nissan.setFuelPerMillage(10);


        CarService carService = new CarServiceImpl();


        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("1. Hereke basla");
            System.out.println("2. Melumat lovhesi");
            System.out.println("3. YDM");
            System.out.println("4. Cixis");
            System.out.println("Reqem daxil edin:");
            int userInput = scanner.nextInt();
            if (userInput == 4){
                break;
            }
            switch (userInput){

                case 1:
                    System.out.println("Hereke basla");
                    int userKm = scanner.nextInt();
                    carService.run(nissan, userKm);
                    break;
                case 2:
                    Car car = carService.getInfo(nissan);
                    System.out.println(car.getFuel());
                    System.out.println(car.getMillage());
                    break;
                case 3:
                    carService.fuelStation(nissan, 25);
                    break;
                default:
                    System.out.println("Duzgun reqem daxil edin.");
                    break;
            }

        }

    }
}