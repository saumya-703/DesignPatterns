package Singleton;

public class MainClass {
    public static void main(String[] args) {
        appConfig appConfig1 = appConfig.getInstance();
        appConfig appConfig2 = appConfig.getInstance();
        System.out.println(appConfig2 == appConfig1);
    }
}
