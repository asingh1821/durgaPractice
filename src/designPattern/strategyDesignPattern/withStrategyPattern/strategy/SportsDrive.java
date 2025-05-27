package designPattern.strategyDesignPattern.withStrategyPattern.strategy;

public class SportsDrive implements DrivingStrategy {

    @Override
    public void drive(){
        System.out.println("It has sports drive capability");
    }
}
