//we need only one instance of a class

public class Appsetting {
    

    private static Appsetting instance;




    private String databaseURL;
    private String apiURL;

    private Appsetting(){
        databaseURL="database1314";
        apiURL="1223api";
    }

    public static Appsetting getInstance(){
        if(instance==null){
        instance=new Appsetting();
        }
        return instance;
    }

    public String getDatabaseURL(){
        return databaseURL;
    }

    public String getapiURL(){
        return apiURL;
    }
    
}
