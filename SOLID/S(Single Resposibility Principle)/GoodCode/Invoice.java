public class Invoice {
    private double amount;

    public Invoice(double amount){
        this.amount=amount;
    }

    public void generateinvoice(){
        System.out.println("Invoice generated for amount "+ amount);
    }

   

}
