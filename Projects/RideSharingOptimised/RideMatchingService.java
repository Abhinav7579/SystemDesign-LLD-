import java.util.ArrayList;
import java.util.List;

public class RideMatchingService {
    private List<Driver>availableDrivers=new ArrayList<>();

    public void addDriver(Driver driver){
        availableDrivers.add(driver);
    }

    public void requestRide(Passenger passenger,double distance,FareStrategy fareStrategy){

        if(availableDrivers.isEmpty()){
            passenger.notify("no drivers are available");
            return;
        }

        Driver nearestDriver=findNearestDriver(passenger.getLocation());
        availableDrivers.remove(nearestDriver); 
        //passenger.notify("Ride schedule successfully "+nearestDriver);
        Ride ride=new Ride(passenger,nearestDriver,distance,fareStrategy);
        ride.calculatedFare();

        passenger.notify("Ride schedule successfully with fare "+ride.geFare());
        nearestDriver.notify("you have a new ride request of amount "+ride.geFare());

        //change the status of ride
        ride.updateStatus(RideStatus.ONGOING);


        //after ride finish
        ride.updateStatus(RideStatus.COMPLETED);
        availableDrivers.add(nearestDriver);
        return;

    }

    private Driver findNearestDriver(Location passengerLocation){
        Driver assignDriver=null;
        double minDis=Double.MAX_VALUE;
        for(Driver driver:availableDrivers){
            double distance=driver.getLocation().calcDistance(passengerLocation);
            if(distance<minDis){
                distance=minDis;
                assignDriver=driver;
            }
        }
        return assignDriver;
    }

}
