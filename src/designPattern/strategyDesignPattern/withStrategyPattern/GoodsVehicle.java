package designPattern.strategyDesignPattern.withStrategyPattern;

import designPattern.strategyDesignPattern.withStrategyPattern.strategy.DrivingStrategy;
import designPattern.strategyDesignPattern.withStrategyPattern.strategy.NormalDrive;

public class GoodsVehicle extends Vehicle{


    public GoodsVehicle() {
        super(new NormalDrive());
    }
}
