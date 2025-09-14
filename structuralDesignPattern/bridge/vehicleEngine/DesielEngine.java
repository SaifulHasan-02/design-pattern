package structuralDesignPattern.bridge.vehicleEngine;

public class DesielEngine implements Engine{

    @Override
    public Engine getEngineType() {
        return new DesielEngine();
    }
}
