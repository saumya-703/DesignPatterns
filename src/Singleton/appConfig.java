package Singleton;

public class appConfig {
    private static appConfig instance;
    private appConfig(){
        System.out.println("Appconfig created");
    }
    public static appConfig getInstance(){
        if(instance == null){
            instance=  new appConfig();
        }
        return instance;
    }
}
