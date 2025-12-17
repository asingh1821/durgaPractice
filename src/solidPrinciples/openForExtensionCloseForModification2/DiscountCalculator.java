package solidPrinciples.openForExtensionCloseForModification2;

public class DiscountCalculator {

    public double calculateDiscount(Discount discount, double amount){
        return discount.calculate(amount);
    }
}
