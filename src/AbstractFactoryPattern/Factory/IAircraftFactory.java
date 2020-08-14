package AbstractFactoryPattern.Factory;

import AbstractFactoryPattern.Modules.Wings.IWings;
import AbstractFactoryPattern.Modules.Cockpit.ICockpit;
import AbstractFactoryPattern.Modules.Engine.IEngine;

public interface IAircraftFactory {

    IEngine createEngine();

    ICockpit createCockpit();

    IWings createWings();

}
