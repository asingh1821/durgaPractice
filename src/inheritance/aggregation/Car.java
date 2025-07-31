package inheritance.aggregation;

public class Car {

    private String model;
    private Engine engineType;

    public Car(String model, Engine engineType){
        this.model = model;
        this.engineType = engineType;
    }
    public void startCar(){
        System.out.println("car model "+ model);
        engineType.startEngine();
    }
}
