
public class UPI implements PaymentMethod {
     @Override
    public void pay(double amount){
        System.out.println("paying via upi "+ amount);
    }
    
}
