
public class NotificationService {

    private EmailService emailservice;
    private SMSService smsservice;
    

    public NotificationService(){
        this.emailservice=new EmailService();
        this.smsservice=mew SMSService();
    }

    public void notifyByEmail(string msg){
        emailservice.sendEmail(msg);
    }
    publid void notifyByEmailSMS(string msg){
        smsservice.sendSMS(msg);
    }
    
}
