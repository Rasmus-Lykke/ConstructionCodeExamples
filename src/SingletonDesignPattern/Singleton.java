package SingletonDesignPattern;

// Thread Synchronized Java implementation of
// singleton design pattern
public class Singleton {

    private static Singleton obj;

    private Singleton() { }

    // Only one thread can execute this at a time
    public static synchronized Singleton getInstance() {
        if (obj == null) {
            obj = new Singleton();
        }
        return obj;
    }

    public static void main(String[] args) {
        System.out.println(getInstance());
    }
}
