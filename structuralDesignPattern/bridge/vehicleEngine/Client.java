package structuralDesignPattern.bridge.vehicleEngine;

public class Client {
    public static void main(String[] args) {
        Engine engine = new PetrolEngine();

        Vehicle bike = new Bike(engine);
        bike.manufactureVehicle();

        Engine electricEngine = new ElectricEngine();
        Vehicle bike2 = new Bike(electricEngine);
        bike2.manufactureVehicle();

        Vehicle electricCar = new Car(electricEngine);
        electricCar.manufactureVehicle();
    }
}
