package solidPrinciples.interfaceSegregationPrinciple.hotel;

public class Waiter implements FoodServe{
    @Override
    public void serveFood() {
        System.out.println("Waiters are serving food");
    }
}
