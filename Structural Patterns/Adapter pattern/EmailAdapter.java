
public class EmailAdapter implements NotificationService {

    private SendGrid sendgridService;

    public EmailAdapter(SendGrid sendgridService){
        this.sendgridService=sendgridService;
    }

    @Override
     public void send(String to,String subject,String body){
        sendgridService.sendEmail(to,subject,body);

     }

    
}
