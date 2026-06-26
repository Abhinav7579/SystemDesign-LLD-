//intrinsic properties
public class BulletType {
    private String color;

    public BulletType(String color){
        this.color=color;
        System.out.println("creating bullet with color "+color);
    }
    public String getColor(){
        return color;
    }
    
}
