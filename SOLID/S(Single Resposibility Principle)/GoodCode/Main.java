
public class Main {
    public static void main(String[] args) {
        Invoice I=new Invoice(100);
        I.generateinvoice();
        EmailService e=new EmailService();
        e.sendEmail();


    }
    
}
