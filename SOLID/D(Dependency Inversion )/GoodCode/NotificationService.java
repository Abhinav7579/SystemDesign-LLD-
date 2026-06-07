
public class NotificationService {
    private NotificationChannel notificationChannel;

    public NotificationService(NotificationChannel ch){
        this.notificationChannel=ch;
    }
    public void Notify(String msg){
        notificationChannel.send(msg);
    }
    
}
