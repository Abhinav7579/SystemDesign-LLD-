
public class Client {
    public static void main(String[] args) {
        NotificationService email=new EmailNotificationService();
        email.send("abhi@gmail.com","purchased shoes","you have purchased your shoes");

        NotificationService emailAdapter=new EmailAdapter(new SendGrid());
        emailAdapter.send("abhinav@gmail.com","purchased shoes","you have purchased your shoes");
    }
}
