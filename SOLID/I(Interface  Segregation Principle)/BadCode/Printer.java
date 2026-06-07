
public class Printer  implements Machine{
     @Override
    public void print(){
        System.out.println("printing");
    }
     @Override
    public void scan(){
        throw new UnsupportedOperationException("cannot scan");
    }
     @Override
    public void copy(){
        throw new UnsupportedOperationException("cannot copy");

    }
    
}
