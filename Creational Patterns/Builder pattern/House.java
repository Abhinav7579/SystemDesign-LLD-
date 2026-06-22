
public class House {
    private String structure;
    private String roof;
    private String floor;
    private boolean hasGarden;
    private boolean hasSwimmingPool;
    private boolean hasGarage;

    private House(HouseBuilder builder){
        this.structure=builder.structure;
        this.roof=builder.roof;
        this.floor=builder.floor;
        this.hasGarden=builder.hasGarden;
        this.hasSwimmingPool=builder.hasSwimmingPool;
        this.hasGarage=builder.hasGarage;

    }
    
    @Override
    public String toString(){
        return "House{ "+
            "structure-> "+structure+ " roof->  "+roof+ " floor-> " +floor+ " garage-> "+hasGarden+" swimmingpool-> " +hasSwimmingPool+ " garage-> " +hasGarage
             +" }";
    }



    public static class HouseBuilder{
        
       private String structure;
       private String roof;
       private String floor;
       private boolean hasGarden;
       private boolean hasSwimmingPool;
       private boolean hasGarage;

    //builder constructor with mandatory parameter
    public HouseBuilder(String structure,String roof,String floor){
        this.structure=structure;
        this.roof=roof;
        this.floor=floor;
       }

       //optinal parameter
       public HouseBuilder setGarden(boolean hasGarden){
        this.hasGarden=hasGarden;
        return this;
       }
        public HouseBuilder setSwimmingPool(boolean hasSwimmingPool){
        this.hasSwimmingPool=hasSwimmingPool;
        return this;
       }
        public HouseBuilder setGarage(boolean hasGarage){
        this.hasGarage=hasGarage;
        return this;
       }

       public House build(){
             return new House(this);
       }

    }

    
}
