package designPattern.factoryDesignPattern.example3;

public class WordDocument implements Document{
    @Override
    public String render() {
        return "rendering word document";
    }
}
