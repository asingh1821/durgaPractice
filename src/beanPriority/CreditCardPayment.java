package beanPriority;

public class CreditCardPayment implements PaymentService{
    @Override
    public String payment() {
        return "credit card payment service method....";
    }
}
