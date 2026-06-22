
public class Builderpattern {

    public static void main(String[] args) {
        House house=new House.HouseBuilder("concrete","wooden","tile")  //cumpulsary
                               .setGarden(true)     //these all are optional
                               .setSwimmingPool(true)
                               
                               .build();

        System.out.println(house);                       
                              
    }
    
}
