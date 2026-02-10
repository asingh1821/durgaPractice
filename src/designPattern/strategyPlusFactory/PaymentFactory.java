package designPattern.strategyPlusFactory;

class PaymentFactory {
    public static PaymentService paymentfactory(String input){
        return switch (input) {
            case "Net" -> new NetBanking();
            case "Card" -> new CreditCardPayment();
            case "UPI" -> new UPIPayment();
            default -> throw new IllegalArgumentException("wrong input taken");
        };
    }
}
