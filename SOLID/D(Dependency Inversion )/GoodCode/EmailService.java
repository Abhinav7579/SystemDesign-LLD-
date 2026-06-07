
public class EmailService implements NotificationChannel {

    @Override
    public void send(String msg){
        System.out.println("sending email "+msg);
    }
    
}
