package structuralDesignPattern.bridge.vehicleEngine;

public class Car extends Vehicle{

    Car(Engine engine){
        super(engine);
    }
    @Override
    public void manufactureVehicle() {
        Engine engine1 =  engine.getEngineType();
        System.out.println("Manufacturing car with engine type: "+ engine1);
    }
}
