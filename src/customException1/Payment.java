package customException1;

import Exception.PaymentException;

class Payment {
     public void processPayment(double amount) throws PaymentException {

         if (amount <= 0) {
             throw new PaymentException("the payment is invalid" + amount);
         }

     }
}
