
public class Location {
    private double latitude;
    private double longitude;
    
    public Location(double  latitude,double longitude){
        this.latitude=latitude;
        this.longitude=longitude;
    }
    public double get_latitude(){
        return latitude;
    }
    public double get_longitude(){
        return longitude;
    }

    public double calcDistance(Location two){
        double dx=this.get_latitude()-two.get_latitude();
        double dy=this.get_longitude()-two.get_longitude();
        return Math.sqrt(dx*dx+dy*dy);
    } 
    
    

}
