package designPattern.strategyPlusFactory;

public class CreditCardPayment extends PaymentService{
    @Override
    String payment() {
        return "Credit card payment active.....";
    }
}
