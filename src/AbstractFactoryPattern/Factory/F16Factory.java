package AbstractFactoryPattern.Factory;

import AbstractFactoryPattern.Modules.Cockpit.F16Cockpit;
import AbstractFactoryPattern.Modules.Cockpit.ICockpit;
import AbstractFactoryPattern.Modules.Wings.F16Wings;
import AbstractFactoryPattern.Modules.Wings.IWings;
import AbstractFactoryPattern.Modules.Engine.F16Engine;
import AbstractFactoryPattern.Modules.Engine.IEngine;

public class F16Factory implements IAircraftFactory {
    @Override
    public IEngine createEngine() {
        return new F16Engine();
    }

    @Override
    public ICockpit createCockpit() {
        return new F16Cockpit();
    }

    @Override
    public IWings createWings() {
        return new F16Wings();
    }
}
