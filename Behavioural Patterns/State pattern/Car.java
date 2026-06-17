
public class Car implements TransportationMode {
    @Override
    public int calETA(){
        System.out.println("calculation car eta");
        return 2;
    }

    @Override
    public String getDirection(){
        return "direction for car";
    }
}
