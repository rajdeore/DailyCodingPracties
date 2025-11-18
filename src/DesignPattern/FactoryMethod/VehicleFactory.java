package DesignPattern.FactoryMethod;

public class VehicleFactory {
    public static Vehicle getInstance(String vehicle){
        if(vehicle.equalsIgnoreCase("Car")){
            return new Car();
        } else if (vehicle.equalsIgnoreCase("Bike")) {
            return new Bike();
        }

        throw new IllegalArgumentException("Unknown vehicle type");
    }
}
