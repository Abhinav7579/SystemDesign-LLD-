
public class CreditCard implements PaymentMethod {
    
    @Override
    public void pay(double amount){
        System.out.println("paying via credit card "+ amount);
    }
    
}
