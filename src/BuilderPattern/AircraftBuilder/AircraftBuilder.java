package BuilderPattern.AircraftBuilder;

import BuilderPattern.Aircraft.IAircraft;

public abstract class AircraftBuilder {
    public void buildEngine() {
    }

    public void buildWings() {
    }

    public void buildCockpit() {
    }

    public void buildBathrooms() {
    }

    abstract public IAircraft getResult();
}
