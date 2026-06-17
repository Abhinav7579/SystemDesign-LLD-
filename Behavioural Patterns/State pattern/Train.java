
public class Train implements TransportationMode {
    @Override
    public int calETA(){
        System.out.println("calculation train eta");
        return 1;
    }

    @Override
    public String getDirection(){
        return "direction for train";
    }
}
