package designPattern.strategyDesignPattern.withStrategyPattern;

import designPattern.strategyDesignPattern.withStrategyPattern.strategy.DrivingStrategy;
import designPattern.strategyDesignPattern.withStrategyPattern.strategy.NormalDrive;
import designPattern.strategyDesignPattern.withStrategyPattern.strategy.SportsDrive;

public class SportsVehicle extends Vehicle{


    public SportsVehicle() {
        super(new SportsDrive());
    }
}
