package structuralDesignPattern.bridge.vehicleEngine;

public class ElectricEngine implements Engine{
    @Override
    public Engine getEngineType() {
        return new ElectricEngine();
    }
}
