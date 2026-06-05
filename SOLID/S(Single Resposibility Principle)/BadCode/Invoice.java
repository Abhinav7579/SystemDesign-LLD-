public class Invoice {
    private double amount;

    public Invoice(double amount){
        this.amount=amount;
    }

    public void generateinvoice(){
        System.out.println("Invoice generated for amount " + amount);
    }

    public void savetoDb(){
        System.out.println("invoice saved to database");
    }

     public void sendEmail(){
        System.out.println("email sent");
    }

}
