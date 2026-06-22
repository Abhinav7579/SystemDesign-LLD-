
public class Gamepiece implements Prototype <Gamepiece>{

    private String color;
    private int pos;

    public Gamepiece(String color,int pos){
        this.color=color;
        this.pos=pos;
    }

    public void changeColor(String color){
        this.color=color;
    }
    
    public void changePos(int pos){
        this.pos=pos;
    }

    @Override
    public Gamepiece clone(){
        return new Gamepiece(this.color,this.pos);
    }

    @Override
    public String toString() {
        return "GamePiece{" +
                "color='" + color + '\'' +
                ", position=" + pos +
                '}';
    }
    
}
