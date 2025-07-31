package designPattern.factoryDesignPattern.example1;

public class WebDeveloper implements Employee {
    @Override
    public int salary() {
        System.out.println("WEB developer salary");
        return 50000;
    }
}
