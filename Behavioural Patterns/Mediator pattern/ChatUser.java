
public class ChatUser {

    private String name;
    private ChatMediator chatMediator;

    public ChatUser(String name,ChatMediator chatMediator){
        this.name=name;
        this.chatMediator=chatMediator;
    }

    public void sendMessage(String msg){
        chatMediator.sendMessage(msg,this);
        
    }

    public String getName(){
        return name;
    }

    public void recieveMsg(String msg, ChatUser sender){
        System.out.println(msg +" recieved to "+name+" by "+sender.name);
    }
    
}
