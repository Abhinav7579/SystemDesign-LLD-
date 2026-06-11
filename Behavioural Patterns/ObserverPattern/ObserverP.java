import java.util.*;
interface Observer{
    void update(float temp);
}
interface Subject{
    void attach(Observer obs);
    void detach(Observer obs);
    void notifyObserverrs();
}

class WeatherStation implements Subject{
    private List<Observer> observers;
    private float temperature;

    public WeatherStation(){
        observers=new ArrayList<>();
    }

    @Override
    public void attach(Observer obs) {
        if (obs != null && !observers.contains(obs)) observers.add(obs);
    }

    @Override
    public void detach(Observer obs) {
        observers.remove(obs);
    }

    @Override
    public void notifyObserverrs() {
        for (Observer o : observers) {
            o.update(temperature);
        }
    }

    public void setTemperature(float temp) {
        this.temperature = temp;
        notifyObserverrs();
    }
}


class Gauge implements Observer{
     @Override
    public void update(float temp){
        System.out.println("temp on gauge is "+temp);
    }

}

class MobileDevice implements Observer{
    @Override
    public void update(float temp){
        System.out.println("temp on mobile is "+temp);
    }
}

public class ObserverP {
    public static void main(String[] args) {
        MobileDevice m1=new MobileDevice();
        Gauge g1=new Gauge();

        WeatherStation station=new WeatherStation();
        station.attach(g1);
        station.attach(m1);
        station.setTemperature(23.2f);
        
    }
    
}
