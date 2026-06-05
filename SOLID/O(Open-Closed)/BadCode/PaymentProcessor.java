
public class PaymentProcessor {

    public void processPayment(String paymentMethod, double amount){
        if(paymentMethod.equals("CreditCard")){
            System.out.println("making payment via credit card "+amount);
        }
        else if(paymentMethod.equals("upi")){
            System.out.println("making payment via upi "+amount);
        }
        else if(paymentMethod.equals("debit card")){
            System.out.println("making payment via debit card "+amount);
        }
        else{
            throw new IllegalArgumentException("unsupported payment method "+paymentMethod);
        }
    }
    
}
