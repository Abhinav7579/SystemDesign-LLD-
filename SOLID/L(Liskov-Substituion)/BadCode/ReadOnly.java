
public class ReadOnly extends File {
    public void write(){
        throw new UnsupportedOperationException("cannot write this file");
    }
    
}
