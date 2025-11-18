package DesignPattern.FactoryMethod;

public class Transport {
    public static void main(String[] args) {
        Vehicle v1 = VehicleFactory.getInstance("car");
        v1.start();

        Vehicle v2 = VehicleFactory.getInstance("bike");
        v2.start();
    }
}
