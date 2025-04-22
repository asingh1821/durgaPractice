package designPattern.strategyDesignPattern.withoutStrategyPattern;

public class Main {
    public static void main(String[] args) {
        Vehicle n = new NormalVehicle();
        n.drive();
        Vehicle s = new SportsVehicle();
        s.drive();
    }
}
