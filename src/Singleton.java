public class Singleton {
    private static final Singleton INSTANCE = new Singleton();

    private Singleton(){}

    public static Singleton getInstance(){
        return INSTANCE;
    }
    public void startConnection(){
        System.out.println("Database connection start");
    }

}
