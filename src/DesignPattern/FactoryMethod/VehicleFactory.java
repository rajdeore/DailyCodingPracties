package DesignPattern.FactoryMethod;

public class VehicleFactory {
    public static Vehicle getInstance(String vehicle){

/*

        if(vehicle.equalsIgnoreCase("Car")){
            return new Car();
        } else if (vehicle.equalsIgnoreCase("Bike")) {
            return new Bike();
        }

        throw new IllegalArgumentException("Unknown vehicle type");

*/
        //good way
        if(vehicle == null){
            throw new IllegalArgumentException("Unknown vehical type");
        }
        switch (vehicle.toUpperCase()){
            case "CAR":
                return new Car();
            case "BIKE":
                return new Bike();
            default:
                throw new IllegalArgumentException("Invalid vehicle");
        }

    }
}
