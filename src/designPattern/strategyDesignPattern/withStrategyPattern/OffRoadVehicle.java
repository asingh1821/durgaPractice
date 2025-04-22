package designPattern.strategyDesignPattern.withStrategyPattern;

import designPattern.strategyDesignPattern.withStrategyPattern.strategy.DrivingStrategy;
import designPattern.strategyDesignPattern.withStrategyPattern.strategy.SportsDrive;

public class OffRoadVehicle extends Vehicle{


    public OffRoadVehicle() {
        super(new SportsDrive());
    }
}
