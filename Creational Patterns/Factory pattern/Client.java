
public class Client {
    public static void main(String[] args) {
        
        Transport vehicle=TransportFactory.createTransport("bus");

        vehicle.deliverVehicle();
    }
    
}
