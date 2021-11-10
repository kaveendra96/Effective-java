public class SingletonWithSynchronized {

    private static volatile SingletonWithSynchronized singletonWithSynchronized;

    private SingletonWithSynchronized() {
        if (singletonWithSynchronized != null) {
            throw new RuntimeException("please use getInstance");
        }
    }

    public static SingletonWithSynchronized getInstance() {
        if (singletonWithSynchronized == null) {
            synchronized (SingletonWithSynchronized.class) {
                if (singletonWithSynchronized == null) {
                    singletonWithSynchronized = new SingletonWithSynchronized();
                }
            }
        }
        return singletonWithSynchronized;
    }


}
