package designPattern.strategyDesignPattern.withStrategyPattern;

import designPattern.strategyDesignPattern.withStrategyPattern.strategy.DrivingStrategy;
import designPattern.strategyDesignPattern.withStrategyPattern.strategy.NormalDrive;

public class Main {

    public static void main(String[] args) {
        Vehicle v = new SportsVehicle();
        v.drive();
    }
}
