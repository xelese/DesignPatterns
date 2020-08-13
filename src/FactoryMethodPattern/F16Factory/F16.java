package FactoryMethodPattern.F16Factory;

import FactoryMethodPattern.Cockpit.F16Cockpit;
import FactoryMethodPattern.Cockpit.ICockpit;
import FactoryMethodPattern.Engine.F16Engine;
import FactoryMethodPattern.Engine.IEngine;

/**
 * Start here.
 * <p>
 * 1. Created a base F16 that is used to create other types of F16 air crafts.
 * 2. IEngine and ICockpit are two interfaces which have many types of engines and cockpits as implementations.
 * 3. F16A and F16B uses the F16 implementation and extends its functionality by changing the appropriate type of
 * variable.
 */
public class F16 {
    IEngine engine;
    ICockpit cockpit;

    protected F16 makeF16() {
        this.engine = new F16Engine();
        this.cockpit = new F16Cockpit();
        return this;
    }

    public void taxi() {
        System.out.println("F16 is taxing on the runway!");
    }

    public void fly() {
        F16 f16 = makeF16();
        f16.taxi();
        System.out.println("taking off for Flying!");
    }
}


