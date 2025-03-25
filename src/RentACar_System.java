import java.util.Scanner;
class RentVehicle {
    private String vehicleID;
    private String vehicleModel;
    private int vehicleYear;

    RentVehicle (String vehicleID, String vehicleModel, int vehicleYear){
        this.vehicleID = vehicleID;
        this.vehicleModel = vehicleModel;
        this.vehicleYear = vehicleYear;
        System.out.println("New vehicle object is created succsessfully.");

    }
    public String getVehicleID(){
        return vehicleID;
    }
    public String getVehicleModel(){
        return vehicleModel;
    }
    public int getVehicleYear(){
        return vehicleYear;
    }
    public void setVehicleID(){
        this.vehicleID=vehicleID;
    }
    public void setVehicleModel(){
        this.vehicleModel=vehicleModel;
    }
    public void setVehicleYear(){
        this.vehicleYear=vehicleYear;
    }
    public void showInfo(){
        System.out.println("Vehicle ID: "+ this.vehicleID);
        System.out.println("Vehicle Model: "+ this.vehicleModel);
        System.out.println("Vehicle Year: "+ this.vehicleYear);
    }
}
class RentCar extends RentVehicle{
    private int numberOfDoors;
    private static int carCounter=0;

    RentCar(String vehicleID, String vehicleModel, int vehicleYear,int numberOfDoors){
        super(vehicleID, vehicleModel,vehicleYear);
        this.numberOfDoors=numberOfDoors;
        System.out.println("New car object is created.");
    }
    RentCar(String vehicleModel, int vehicleYear, int numberOfDoors){
        this("OTO-"+carCounter++, vehicleModel,vehicleYear, numberOfDoors);
        System.out.println("The new vehicle has been created with the default ID: "+vehicleModel);
    }
    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("The number of doors: "+this.numberOfDoors);
    }
    public int getNumberOfDoors(){
        return numberOfDoors;
    }
    public void setNumberOfDoors() {
        this.numberOfDoors = numberOfDoors;
    }

}
class RentMotorcycle extends RentVehicle{
    private int engineCapacity;
    private static int motorcycleCounter=0;

    RentMotorcycle(String vehicleID, String vehicleModel, int vehicleYear,int engineCapacity){
        super(vehicleID, vehicleModel,vehicleYear);
        this.engineCapacity=engineCapacity;
        System.out.println("New motorcycle object is created.");
    }
    RentMotorcycle(String vehicleModel, int vehicleYear, int engineCapacity){
        this("MOT-"+motorcycleCounter++, vehicleModel,vehicleYear, engineCapacity);
        System.out.println("The new vehicle has been created with the default ID: "  +vehicleModel);
    }
    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("The capacity of the engine: "+this.engineCapacity);
    }
    public int getEngineCapacity(){
        return engineCapacity;
    }
    public void setEngineCapacity() {
        this.engineCapacity = engineCapacity;
    }

}
public class RentACar_System {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
    }
}
