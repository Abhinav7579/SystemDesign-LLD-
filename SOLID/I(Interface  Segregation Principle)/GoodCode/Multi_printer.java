
public class Multi_printer implements Printer,Scanner,Copy {
    
    @Override
    public void print(){
        System.out.println("printing");
    }
     @Override
    public void scan(){
        System.out.println("scanning");
    }
     @Override
    public void copy(){
        System.out.println("copying");
    }
    
}

    

