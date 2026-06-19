
public class Main {
    public static void main(String[] args) {
        
        Appsetting appSetting=Appsetting.getInstance();
        System.out.println(appSetting.getDatabaseURL());

        Appsetting appSetting1=Appsetting.getInstance();
        System.out.println(appSetting1.getDatabaseURL());

        System.out.println(appSetting==appSetting1);
        


    }
    
}
