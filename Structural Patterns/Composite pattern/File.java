
public class File implements FileSystemComponents{
    private String name;

    public File(String name){
        this.name=name;
    }


    @Override
    public void showDetails(){
        System.out.println("file: "+name);
    }
    
}
