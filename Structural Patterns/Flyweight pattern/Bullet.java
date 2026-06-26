
public class Bullet {
    private BulletType type;
    private int x,y;
    private double velocity;

    public Bullet(String color,int x,int y,double velocity){
        this.type=BulletTypeFactory.getBulletType(color);
        this.x=x;
        this.y=y;
        this.velocity=velocity;
        System.out.println("created a bullet with position +"+x+" "+y+" with velocity "+velocity);
    }
    public void display(){
        System.out.println("bullet with position +"+x+" "+y+" with velocity "+velocity+ " with color "+type.getColor());

    }
    
}
