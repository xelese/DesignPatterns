package FactoryMethodPattern.F16Factory;

import FactoryMethodPattern.Engine.F16AEngine;

public class F16A extends F16 {

    @Override
    protected F16 makeF16() {
        super.makeF16();
        super.engine = new F16AEngine();
        return this;
    }

    @Override
    public void taxi() {
        System.out.println("F16A is taxing on the runway!");
    }
}