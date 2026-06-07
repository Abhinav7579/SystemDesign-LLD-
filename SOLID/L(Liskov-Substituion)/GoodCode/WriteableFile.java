
public class WriteableFile extends ReadableFile implements Writable{
    
    @Override
    public void write(){
        System.out.println("writing a file");
    }

}
