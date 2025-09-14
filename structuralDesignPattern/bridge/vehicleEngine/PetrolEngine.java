package structuralDesignPattern.bridge.vehicleEngine;

public class PetrolEngine implements Engine{
    @Override
    public Engine getEngineType() {
        return new PetrolEngine();
    }
}
