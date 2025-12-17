package solidPrinciples.openForExtensionCloseForModification2;

public class Main {

    public static void main(String[] args) {
        Discount d = new RegularDiscount();
        DiscountCalculator discountCalculator = new DiscountCalculator();
        double discountedAmount = discountCalculator.calculateDiscount(d,100);

        System.out.println("Discounted amount is: "+ discountedAmount);
    }
}
