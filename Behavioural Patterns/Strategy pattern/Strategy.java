
public class Strategy {
    public static void main(String[] args) {
        PaymentMethod debitcard=new DebitCard();
        PaymentMethod upi=new UPI();
        PaymentProcessor processor=new PaymentProcessor(debitcard);
        PaymentProcessor processor2=new PaymentProcessor(upi);
       
        processor.processPayment();
        processor2.processPayment();
        
        
    }

}
interface PaymentMethod{
    void pay();
}
class DebitCard implements PaymentMethod{
    @Override
    public void pay(){
        System.out.println("paying using debit card");
    }
}
class UPI implements PaymentMethod{
    @Override
    public void pay(){
        System.out.println("paying using UPI");
    }
}

class PaymentProcessor{
    
    private PaymentMethod paymentmethod;
    PaymentProcessor(PaymentMethod p){
        paymentmethod=p;
    }
    public void processPayment(){
        paymentmethod.pay();
    }
}