package designPattern.strategyPlusFactory;

public class NetBanking extends PaymentService{
    @Override
    String payment() {
        return "Net banking payment active......";
    }
}
