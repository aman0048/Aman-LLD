package designPatterns.singleton;// This is for the designPatterns.singleton.Singleton Design Pattern
/*
    1) Only one object will be created.
    2) Critical section is handled using double lock check in synchronized block
 */
public class Singleton {
    private static Singleton instance;

    private Singleton(){}

    public static Singleton getInstance(){
        if (instance == null){
            synchronized(Singleton.class){
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
