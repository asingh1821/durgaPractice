package solidPrinciples.interfaceSegregationPrinciple.hotel;

public class Chef implements CookingService{
    @Override
    public void cook() {
        System.out.println("Chefs are cooking food");
    }
}
