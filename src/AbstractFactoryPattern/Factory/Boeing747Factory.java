package AbstractFactoryPattern.Factory;

import AbstractFactoryPattern.Modules.Cockpit.Boeing747Cockpit;
import AbstractFactoryPattern.Modules.Cockpit.ICockpit;
import AbstractFactoryPattern.Modules.Engine.Boeing747Engine;
import AbstractFactoryPattern.Modules.Engine.IEngine;
import AbstractFactoryPattern.Modules.Wings.Boeing747Wings;
import AbstractFactoryPattern.Modules.Wings.IWings;

public class Boeing747Factory implements IAircraftFactory {
    @Override
    public IEngine createEngine() {
        return new Boeing747Engine();
    }

    @Override
    public ICockpit createCockpit() {
        return new Boeing747Cockpit();
    }

    @Override
    public IWings createWings() {
        return new Boeing747Wings();
    }
}
