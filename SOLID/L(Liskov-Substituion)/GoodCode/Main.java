
public class Main {

    public static void main(String[] args) {
        ReadableFile r1=new ReadOnlyFile();
        r1.read();

        WriteableFile w1=new WriteableFile();
        w1.read();
        w1.write();
        
    }
    
}
