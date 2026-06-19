import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatMediator {
    private List<ChatUser>users;
    
    public ChatRoom(){
        users=new ArrayList<>();
     }
    @Override
    public void sendMessage(String msg, ChatUser sender){
        for(ChatUser user:users){
            if(user==sender)continue;
            user.recieveMsg(msg,sender);

        }
    }
        
    @Override
    public void addUser(ChatUser user){
        users.add(user);
    }

    
}
