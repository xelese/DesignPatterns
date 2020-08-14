package AbstractFactoryPattern;

import AbstractFactoryPattern.Factory.IAircraftFactory;
import AbstractFactoryPattern.Modules.Cockpit.ICockpit;
import AbstractFactoryPattern.Modules.Engine.IEngine;
import AbstractFactoryPattern.Modules.Wings.IWings;

public class Aircraft {
    IEngine engine;
    ICockpit cockpit;
    IWings wings;
    IAircraftFactory factory;

    public Aircraft(IAircraftFactory factory) {
        this.factory = factory;
    }

    protected Aircraft makeAircraft() {
        this.engine = this.factory.createEngine();
        this.cockpit = this.factory.createCockpit();
        this.wings = this.factory.createWings();
        return this;
    }

    private void taxi() {
        System.out.println("Taxing on runway");
    }

    public void fly() {
        Aircraft aircraft = makeAircraft();
        aircraft.taxi();
        System.out.println("Flying");
    }
}
