//I have zero knowledge about cars I'm just using my imagination about it
//No one is going to see this but who cares
//I just like yapping :P

import java.util.Scanner;

interface Maintainable{
    void performService();
}
abstract class Vehicle0 implements Maintainable{
    private String model;
    private String brand;
    private String licensePlate;

    public String getModel(){
        return model;
    }
    public String getBrand(){
        return brand;
    }
    public String getLicensePlate(){
        return licensePlate;
    }

    public void setModel(String model){
        this.model=model;
    }
    public void setBrand(String brand){
        this.brand=brand;
    }
    public void setLicensePlate(String licensePlate){
        this.licensePlate=licensePlate;
    }

    public Vehicle0 (String model, String brand, String licensePlate){
        this.model=model;
        this.brand=brand;
        this.licensePlate=licensePlate;
    }
    abstract void scheduleService();

}
class Car0 extends Vehicle0{
    private int serviceMileage;

    public int getServiceMileage(){
        return serviceMileage;
    }
    public void setServiceMileage(int serviceMileage){
        this.serviceMileage=serviceMileage;
    }
    public Car0 (String model, String brand, String licensePlate, int serviceMileage){
        super(model, brand, licensePlate);
        this.serviceMileage=serviceMileage;

    }
    @Override
    public void performService() {
        System.out.println("Performing service for " + getModel() + "...");
        System.out.println("- Oil change");
        System.out.println("- Tire pressure check");
        System.out.println("- Brake system inspection");
        System.out.println("- Engine diagnostics");
        System.out.println("Your car's service is done!");
    }
    @Override
    public void scheduleService(){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Please enter your choice of service mileage.");
        int mileage = scanner.nextInt();
        if (mileage >30000){
            System.out.println("You need to bring your car over here every 6 months.");
        } else if (mileage >= 20000){
            System.out.println("You need to bring your car over here every 4 months.");
        } else if (mileage >= 10000){
            System.out.println("You need to bring your car over here every 2 months.");
        } else {
            System.out.println("You need to bring your car over here every month.");
        }

    }

}
class Motorcycle0 extends Vehicle0{
    private int engineVolume;
    public int getEngineVolume(){
        return  engineVolume;
    }
    public void setEngineVolume(int engineVolume){
        this.engineVolume=engineVolume;
    }

    public Motorcycle0(String model, String brand, String licensePlate, int engineVolume){
        super(model, brand, licensePlate);
        this.engineVolume=engineVolume;
    }
    @Override
    public void performService() {
        System.out.println("Performing service for " + getModel() + "...");
        System.out.println("- Oil change");
        System.out.println("- Tire pressure check");
        System.out.println("- Brake check");
        System.out.println("- Engine diagnostics");
        System.out.println("Your motorcycle's service is done!");
    }
    @Override
    public void scheduleService() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your engine volume.");
        int volume = scanner.nextInt();
        if (volume > 500) {
            System.out.println("You need to bring your motorcycle over here every 6 months.");
        } else {
            System.out.println("You need to bring your car over here once a year.");
        }
    }
}
class Truck0 extends Vehicle0{
    private double loadCapacity;
    private boolean heavyServiceRequired;

    public double getLoadCapacity(){
        return loadCapacity;
    }
    public boolean getHeavyServiceRequired(){
        return heavyServiceRequired;
    }
    public void setLoadCapacity(double loadCapacity){
        this.loadCapacity=loadCapacity;
    }
    public void setHeavyServiceRequired(boolean heavyServiceRequired){
        this.heavyServiceRequired=heavyServiceRequired;
    }
    public Truck0 (String model, String brand, String licensePlate, double loadCapacity, boolean heavyServiceRequired){
        super(model, brand, licensePlate);
        this.loadCapacity= loadCapacity;
        this.heavyServiceRequired=heavyServiceRequired;
    }
    @Override
    public void performService() {
        System.out.println("Performing service for " + getModel() + "...");
        System.out.println("- Oil change");
        System.out.println("- Tire pressure check");
        System.out.println("- Brake check");
        System.out.println("- Engine diagnostics");
        System.out.println("- Load mechanism control");
        System.out.println("Your motorcycle's service is done!");
    }
    @Override
    public void scheduleService() {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Please enter your truck's load capacity: ");
        setLoadCapacity(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Is your truck requires heavy service? 1 is yes and 2 is no");
        String choice = scanner.nextLine();
        if (heavyServiceRequired) {
            System.out.println(getModel() + " needs a heavy service every 2 months.");
        } else if (loadCapacity >= 10) {
            System.out.println(getModel() + " needs a service every 3 months.");
        } else {
            System.out.println(getModel() + " needs a service every year.");
        }
    }
}
public class VehicleService {
    public static void main(String [] args){
        Scanner scanner = new Scanner (System.in);
        Vehicle0[] vehicles = new Vehicle0[3];
        vehicles[0] = new Car0("Model S", "Tesla", "ABC-123", 15000);
        vehicles[1] = new Motorcycle0("Ninja ZX-10R", "Kawasaki", "XYZ-789", 600);
        vehicles[2] = new Truck0("Actros", "Mercedes", "LMN-456", 12.5, true);

        while (true) {
            System.out.println("\nVehicle Maintenance System");
            System.out.println("1. Schedule Service");
            System.out.println("2. Perform Service");
            System.out.println("3. View Vehicle List");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Buffer temizleme

            if (choice == 4) {
                System.out.println("Exiting the system...");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter vehicle model for scheduling service: ");
                    String scheduleModel = scanner.nextLine();
                    for (Vehicle0 v : vehicles) {
                        if (v.getModel().equalsIgnoreCase(scheduleModel)) {
                            v.scheduleService();
                            break;
                        }
                    }
                    break;

                case 2:
                    System.out.print("Enter vehicle model for performing service: ");
                    String serviceModel = scanner.nextLine();
                    for (Vehicle0 v : vehicles) {
                        if (v.getModel().equalsIgnoreCase(serviceModel)) {
                            v.performService();
                            break;
                        }
                    }
                    break;

                case 3:
                    System.out.println("\nRegistered Vehicles:");
                    for (Vehicle0 v : vehicles) {
                        System.out.println(v.getModel() + " (" + v.getBrand() + ")");
                    }
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
    }

        scanner.close();
}
}
