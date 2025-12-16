package solidPrinciples.interfaceSegregationPrinciple.hotel;

public class Washers implements WashUtensils{
    @Override
    public void washing() {
        System.out.println("Washers are washing utensils");
    }
}
