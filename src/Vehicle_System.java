class Vehicle{
    String model;
    int year;

    Vehicle(String model, int year){
        this.model=model;
        this.year=year;
    }

    void startEngine(){
        System.out.println("The engine is starting...");
    }
}

class Car extends Vehicle{
    int numberOfDoors=0;

    Car(String model, int year, int numberOfDoors){
        super(model, year);
        this.numberOfDoors=numberOfDoors;
    }
    @Override
    void startEngine(){
        super.startEngine(); //The method that hasn't gotten overriden yet. Just for test.
        System.out.println("The car engine is starting...");
    }
}

class Motorcycle extends Vehicle{
    int numberOfWheels=2;

    Motorcycle(String model, int year, int numberOfWheels){
         super(model, year);
         this.numberOfWheels=numberOfWheels;
    }
    @Override
    void startEngine(){
        super.startEngine(); //Again, just a test.
        System.out.println("The motorcycle engine is starting...");
    }

}
public class Vehicle_System {
    public static void main(String[] args){
        Car car = new Car ("idk", 2015, 4);
        Motorcycle motorcycle = new Motorcycle ("idk", 2013, 2);

        System.out.println("---Car---");
        System.out.println("Model: "+ car.model);
        System.out.println("Year: "+ car.year);
        System.out.println("Number of doors: "+ car.numberOfDoors);
        car.startEngine();
        System.out.println(" ");
        System.out.println("---Motorcycle---");
        System.out.println("Model: "+ motorcycle.model);
        System.out.println("Year: "+motorcycle.year);
        System.out.println("Number of wheels: "+ motorcycle.numberOfWheels);
        motorcycle.startEngine();
    }
}
