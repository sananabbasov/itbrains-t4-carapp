package az.edu.itbrains.models;

public class Car {

    private int id;
    private String model;
    private String brand;
    private double millage;
    private double fuel;
    private double maxFuel;
    private int fuelPerMillage;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getMillage() {
        return millage;
    }

    public void setMillage(double millage) {
        this.millage = millage;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public double getMaxFuel() {
        return maxFuel;
    }

    public void setMaxFuel(double maxFuel) {
        this.maxFuel = maxFuel;
    }

    public int getFuelPerMillage() {
        return fuelPerMillage;
    }

    public void setFuelPerMillage(int fuelPerMillage) {
        this.fuelPerMillage = fuelPerMillage;
    }
}
