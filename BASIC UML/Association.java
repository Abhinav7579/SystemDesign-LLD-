
public class Association {
    public static void main(String[] args) {
        Student s1=new Student("Abhinav");
        Teacher t1=new Teacher("Mohit");
        t1.teaches(s1);
    }
}
class Teacher{
    private String name;
    Teacher(String name){
        this.name=name;
    }
    public void getName(){
            System.out.println(name);
    }

    public void teaches(Student s){
        System.out.println(name + " teaches " +  s.getName());
       
    }
}
class Student{
        private String name;
        Student(String name){
            this.name=name;
        }
        public String getName(){
            return name;
        }
    }
    
