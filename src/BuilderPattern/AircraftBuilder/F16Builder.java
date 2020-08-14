package BuilderPattern.AircraftBuilder;

import BuilderPattern.Aircraft.F16;
import BuilderPattern.Aircraft.IAircraft;

public class F16Builder extends AircraftBuilder {

    F16 f16;

    @Override
    public void buildEngine() {
    }

    @Override
    public void buildWings() {
    }

    @Override
    public void buildCockpit() {
    }

    public IAircraft getResult() {
        return f16;
    }
}
