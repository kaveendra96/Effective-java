public class Main {
    public static void main(String[] args) {
        //builder pattern
        MobilePhone.Builder builder= new MobilePhone.Builder("Android");
        MobilePhone mobilePhone = builder.camera("Sony 21mp").is4GEnabled(false).isSimLocaked(false).batteryCapasity(5000).build();
        System.out.println(mobilePhone.toString());

        //Singleton
        Singleton singleton = Singleton.getInstance();
        singleton.startConnection();

        //Singleton with enum
        SingletonWithEnum.INSTANCE.connectToDB();
    }
}
