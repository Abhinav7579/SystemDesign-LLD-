//has-a strong relationship

import java.util.* ;
public class Composition {
    public static void main(String[] args) {
        House h1=new House();
        h1.getRooms();
    }
    
}
class Room{
    private String name;
    Room(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}

class House{
    private List<Room> rooms;
    House(){
        rooms=new ArrayList<>();
        rooms.add(new Room("bedroom"));
        rooms.add(new Room("washroom"));
    }
    public void getRooms(){
        for(Room room:rooms){
            System.out.println( room.getName());
        }
    }

}