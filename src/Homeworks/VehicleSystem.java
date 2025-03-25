package Homeworks;
class Vehicle {
    String brand;
    String model;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
        System.out.println("New vehicle object is created!");
    }

    public void showInfo() {
        System.out.println("Vehicle brand: " + brand);
        System.out.println("Vehicle model: " + model);
    }
}

class Car extends Vehicle {
    public Car(String brand, String model) {
        super(brand, model);
        System.out.println("New car object is created!");
    }

    @Override
    public void showInfo() {
        System.out.println("Car brand: " + brand);
        System.out.println("Car model: " + model);
    }
}

class Motorcycle extends Vehicle {
    public Motorcycle(String brand, String model) {
        super(brand, model);
        System.out.println("New motorcycle object is created!");
    }

    @Override
    public void showInfo() {
        System.out.println("Motorcycle brand: " + brand);
        System.out.println("Motorcycle model: " + model);
    }
}

public class VehicleSystem {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla");
        Motorcycle motorcycle = new Motorcycle("Honda", "CBR");

        car.showInfo();
        motorcycle.showInfo();
    }
}
