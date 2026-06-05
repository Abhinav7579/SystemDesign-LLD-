

// has-a weak relationship
import java.util.*;
public class Aggregation {
    public static void main(String[] args) {
        Prof p1=new Prof("MOHIT");
        Prof p2=new Prof("DAS");
        List<Prof>list=new ArrayList<>(List.of(p1,p2));
        Department d1=new Department("cs",list);
        d1.showProffesors();
        
    }
}
class Department{
    private String name;
    private List<Prof> proffesors;
    Department(String name,List<Prof> proffesors){
        this.name=name;
        this.proffesors=proffesors;
    }
    public void getDepartmentName(){
        System.out.println(name);
    }

    public void showProffesors(){
        for(Prof p:proffesors){
            System.out.println(p.getName());
        }
    }
}
class Prof{
     private String name;
    Prof(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}


