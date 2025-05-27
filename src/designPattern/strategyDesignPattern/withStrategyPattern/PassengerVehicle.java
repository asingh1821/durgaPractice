package designPattern.strategyDesignPattern.withStrategyPattern;

import designPattern.strategyDesignPattern.withStrategyPattern.strategy.DrivingStrategy;
import designPattern.strategyDesignPattern.withStrategyPattern.strategy.NormalDrive;

public class PassengerVehicle extends Vehicle{


    public PassengerVehicle() {
        super(new NormalDrive());
    }
}
