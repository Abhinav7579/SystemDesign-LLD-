
public class RealImage implements Image{

    private String filename;
    public RealImage(String filename){
        this.filename=filename;
        loadImageFromDisk();

    }
    private void loadImageFromDisk(){
        System.out.println("loading image from disk");
    }

    @Override
    public void display(){
        System.out.println("displaying the image");
    }
    
}
