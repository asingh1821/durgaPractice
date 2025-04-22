package designPattern.strategyDesignPattern.withStrategyPattern.strategy;

import designPattern.strategyDesignPattern.withStrategyPattern.strategy.DrivingStrategy;

public class NormalDrive implements DrivingStrategy {
    @Override
    public void drive() {
        System.out.println("It has normal drive capability");
    }
}
