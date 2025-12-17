package solidPrinciples.interfaceSegregationPrinciple.hotel;

public class Washerman implements WashUtensils{
    @Override
    public void washing() {
        System.out.println("Washerman are washing utensils");
    }
}
