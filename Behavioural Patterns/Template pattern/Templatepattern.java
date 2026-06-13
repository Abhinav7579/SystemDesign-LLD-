public class Templatepattern {
    public static void main(String[] args) {

        DataParser CSVparser=new CSVparser();
        DataParser JSONparser=new JSONparser();

        CSVparser.parseData();
        JSONparser.parseData();
        
    }

}
abstract class DataParser{

    public final void parse(){
        openFile();
        parseData();
        closeFile();
    }

    protected void openFile(){
        System.out.println("opening the file");
    }
    protected void closeFile(){
        System.out.println("closing the file");
    }
    protected abstract void parseData();

}

class CSVparser extends DataParser{

    @Override
     protected void parseData(){
        System.out.println("parsing csv file");
     }

}

class JSONparser extends DataParser{

    @Override
     protected void parseData(){
        System.out.println("parsing json file");
     }

}