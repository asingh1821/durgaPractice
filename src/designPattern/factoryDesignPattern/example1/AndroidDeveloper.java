package designPattern.factoryDesignPattern.example1;

public class AndroidDeveloper implements Employee {
    @Override
    public int salary() {
        System.out.println("Android Developer salary");
        return 70000;
    }
}
