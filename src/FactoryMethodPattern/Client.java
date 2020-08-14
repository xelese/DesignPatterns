package FactoryMethodPattern;

import FactoryMethodPattern.F16Factory.F16;
import FactoryMethodPattern.F16Factory.F16A;
import FactoryMethodPattern.F16Factory.F16B;

import java.util.ArrayList;
import java.util.Collection;

/**
 * This is a main class for F16.
 */
public class Client {

    public static void main(String[] args) {
        Collection<F16> myAirForce = new ArrayList<>();
        F16 f16A = new F16A();
        F16 f16B = new F16B();
        F16 f16 = new F16();

        myAirForce.add(f16);
        myAirForce.add(f16A);
        myAirForce.add(f16B);

        for (F16 f : myAirForce) {
            f.fly();
        }
    }
}
