package designPattern.strategyPlusFactory;

public class UPIPayment extends PaymentService{
    @Override
    String payment() {
        return "UPI payment active";
    }
}
