package FactoryMethodPattern.F16Factory;

import FactoryMethodPattern.Cockpit.F16BCockpit;

public class F16B extends F16 {

    @Override
    protected F16 makeF16() {
        super.makeF16();
        super.cockpit = new F16BCockpit();
        return this;
    }

    @Override
    public void taxi() {
        System.out.println("F16B is taxing on the runway!");
    }
}