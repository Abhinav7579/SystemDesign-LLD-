public class Main {
    public static void main(String[] args) {
        Location loc1=new Location(12.34, 14.56);
        Location loc2=new Location(15.34, 24.56);
        Location loc3=new Location(44.34, 56.56);

        Vehicle car=new Car("12232F");
        Vehicle bike=new Bike("23221B");

        Driver d1=new Driver("Monu","monu@gmail.com", loc1, bike);
        Driver d2=new Driver("Raju","raju@gmail.com", loc3, car);

        Passenger p1=new Passenger("Abhi", "abhi@gmail.com", loc2);

        RideMatchingService rideMatchingService=new RideMatchingService();

        rideMatchingService.addDriver(d1);
        rideMatchingService.addDriver(d2);
        rideMatchingService.requestRide(p1,12,new StandardFareStrategy());




    }
}
