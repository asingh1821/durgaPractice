package designPattern.strategyDesignPattern.withStrategyPattern;

import designPattern.strategyDesignPattern.withStrategyPattern.strategy.DrivingStrategy;

public class Vehicle {
    private DrivingStrategy d;

    public Vehicle(DrivingStrategy d){
        this.d = d;
    }
    public void drive(){
        d.drive();
    }
}
