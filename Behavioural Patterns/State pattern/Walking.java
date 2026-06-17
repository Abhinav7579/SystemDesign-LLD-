
public class Walking implements TransportationMode {
    @Override
    public int calETA(){
        System.out.println("calculation walking eta");
        return 10;
    }

    @Override
    public String getDirection(){
        return "direction for walking";
    }
}
