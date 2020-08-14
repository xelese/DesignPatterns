package BuilderPattern.AircraftBuilder;

import BuilderPattern.Aircraft.Boeing747;
import BuilderPattern.Aircraft.IAircraft;

public class Boeing747Builder extends AircraftBuilder {

    Boeing747 boeing747;

    @Override
    public void buildCockpit() {
    }

    @Override
    public void buildEngine() {
    }

    @Override
    public void buildBathrooms() {
    }

    @Override
    public void buildWings() {
    }

    public IAircraft getResult() {
        return boeing747;
    }
}
