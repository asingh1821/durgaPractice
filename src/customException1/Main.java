package customException1;

import Exception.PaymentException;

public class Main {

    public static void main(String[] args) {
        Payment payment = new Payment();
        try{
            payment.processPayment(-100.0);
        }catch (PaymentException p){
            System.out.println("Payment processing failed" +p.getMessage());
        }
    }
}
