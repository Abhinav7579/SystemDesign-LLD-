enum RideStatus{
    SCHEDULED,ONGOING,COMPLETED;
}
public class Ride {
    private Passenger passenger;
    private Driver driver;
    private Double distance;
    private FareStrategy fareStrategy;
    private Double fare;
    private RideStatus status;

    public Ride(Passenger passenger,Driver driver,Double distace,FareStrategy fareStrategy){
        this.passenger=passenger;
        this.driver=driver;
        this.distance=distace;
        this.fareStrategy=fareStrategy;
        this.status=RideStatus.SCHEDULED;
    }

    public void calculatedFare(){
        this.fare=fareStrategy.calcFare(driver.getVehicle(),distance);
    }
    public void updateStatus(RideStatus status){
        this.status=status;
        notifyUsers(status);
    }
    private void notifyUsers(RideStatus status){
        passenger.notify("your ride is "+status);
         passenger.notify("ride status "+status);
    }

    public Double geFare(){
        return fare;
    }
}
