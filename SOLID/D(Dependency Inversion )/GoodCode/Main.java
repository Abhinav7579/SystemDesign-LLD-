
public class Main {
    public static void main(String[] args) {
        NotificationService emailnotification=new NotificationService(new EmailService());
        emailnotification.Notify("hello");

        NotificationService smsnotification=new NotificationService(new SMSService());
        smsnotification.Notify("yout otp is 1234");

    }
    
}
