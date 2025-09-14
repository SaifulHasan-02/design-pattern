package structuralDesignPattern.bridge.vehicleEngine;

public abstract class Vehicle {
    Engine engine;

    Vehicle(Engine engine){
        this.engine = engine;
    }

    public abstract void manufactureVehicle();
}
