
public class Client {
    public static void main(String[] args) {
        DirectionService ds=new DirectionService(new Train());
        ds.getETA();
        System.out.println(ds.getDirection());

        ds.setTransportationMode(new Car());
        System.out.println(ds.getDirection());
    }
}
