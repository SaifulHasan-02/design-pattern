package structuralDesignPattern.bridge.vehicleEngine;

public class Bike extends Vehicle{
    Bike(Engine engine){
        super(engine);
    }

    @Override
    public void manufactureVehicle() {
        Engine engine1 = engine.getEngineType();
        System.out.println("Bike is manufacturing with engine is: "+ engine1);
    }


}
