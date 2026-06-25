import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemComponents {
    private String name;
    private List<FileSystemComponents>components=new ArrayList<>();

    public Folder(String name){
        this.name=name;
    }

    public void addComponent(FileSystemComponents component){
        components.add(component);
    }


    @Override
    public void showDetails(){
        System.out.println("folder: "+name);
        for(FileSystemComponents component:components){
            component.showDetails();
        }

    }
}
