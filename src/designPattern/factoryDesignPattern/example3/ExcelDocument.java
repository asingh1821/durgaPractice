package designPattern.factoryDesignPattern.example3;

public class ExcelDocument implements Document{
    @Override
    public String render() {
        return "rendering Excel Documents";
    }
}
