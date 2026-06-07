
public class Main {
    public static void main(String[] args) {
        File f1=new ReadOnly();
        f1.read(); //works fine
        f1.write();
    }
}
