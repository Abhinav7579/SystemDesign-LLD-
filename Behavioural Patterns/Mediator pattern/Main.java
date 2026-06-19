
public class Main {
    public static void main(String[] args) {
        ChatMediator room=new ChatRoom();
        ChatUser c1=new ChatUser("ram",room);
        ChatUser c2=new ChatUser("shyam",room);
        ChatUser c3=new ChatUser("abhi",room);

       
        room.addUser(c1);
        room.addUser(c2);
        room.addUser(c3);
        c1.sendMessage("hello from ram");

    }
    
}
