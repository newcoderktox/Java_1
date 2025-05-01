interface Controllable{
    void turnOn();
    void turnOff();
}

abstract class SmartDevice implements Controllable{
    private String deviceName;

    public String getDeviceName(){
        return deviceName;
    }
    public void setDeviceName(String deviceName){
        this.deviceName=deviceName;
    }
    @Override
    public void turnOn(){
        System.out.println("The " + getDeviceName() + " device is on.");
    }
    @Override
    public void turnOff(){
        System.out.println("The " + getDeviceName() + " device is off.");
    }
    abstract void operate();

    public SmartDevice(String deviceName){
        this.deviceName=deviceName;
    }

}
class Light extends SmartDevice{
    private double brightness;

    public double getBrightness(){
        return brightness;
    }
    public void setBrightness(double brightness){
        this.brightness=brightness;
    }
    public Light (String deviceName, double brightness){
        super(deviceName);
        this.brightness=brightness;
    }

    @Override
    void operate(){
        System.out.println("The brightness of the light is "+ getBrightness() + ".");
    }
}
class Thermostat extends SmartDevice{
    private double temperature;

    public double getTemperature(){
        return temperature;
    }
    public void setTemperature(double temperature){
        this.temperature=temperature;
    }
    public Thermostat(String deviceName, double temperature){
        super(deviceName);
        this.temperature=temperature;
    }
    @Override
    void operate(){
        System.out.println("The temperature is " + getTemperature() + " C degree.");
    }
}
class SmartSpeaker extends SmartDevice{
    private int volume;

    public int getVolume(){
        return volume;
    }
    public void setVolume(int volume){
        this.volume=volume;
    }
    public SmartSpeaker(String deviceName, int volume){
        super(deviceName);
        this.volume=volume;

    }
    @Override
    void operate(){
        System.out.println("The volume is at %" + getVolume() +".");
    }
}

public class SmartHomeDevice {
    public static void main(String[] args){
        SmartDevice[] devices = new SmartDevice[3];
        devices[0] = new Light("Light1", 80.0);
        devices[1] = new Thermostat("Thermo", 25.0);
        devices[2] = new SmartSpeaker("Speaker", 40);

        System.out.println("----Smart Devices Details----");
        for (SmartDevice sm : devices){
            sm.operate();
            sm.turnOn();
            sm.turnOff();
            System.out.println("------------------------------");
        }
    }
}
