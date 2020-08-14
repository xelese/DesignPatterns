package AbstractFactoryPattern;

import AbstractFactoryPattern.Factory.Boeing747Factory;
import AbstractFactoryPattern.Factory.F16Factory;
import AbstractFactoryPattern.Factory.IAircraftFactory;

import java.util.ArrayList;
import java.util.Collection;

public class Client {

    public static void main(String[] args) {
        // Instantiate a concrete factory for F-16
        IAircraftFactory f16Factory = new F16Factory();

        // Instantiate a concrete factory for Boeing-747
        IAircraftFactory boeing747Factory = new Boeing747Factory();

        // Lets create a list of all our airplanes
        Collection<Aircraft> myAirForce = new ArrayList<>();

        // read it as: add aircraft from f16 factory.
        myAirForce.add(new Aircraft(f16Factory));

        // read it as: add aircraft from Boeing-747 factory.
        myAirForce.add(new Aircraft(boeing747Factory));

        for (Aircraft aircraft : myAirForce) {
            aircraft.fly();
        }
    }
}
