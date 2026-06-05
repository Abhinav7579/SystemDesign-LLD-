
public class Main {
    public static void main(String[] args) {
        
        PaymentProcessor p1=new PaymentProcessor();
        PaymentMethod c1=new CreditCard();

        p1.processPayment(c1,100);

        PaymentMethod c2=new UPI();
        p1.processPayment(c1,200);
        

    }
    
}
