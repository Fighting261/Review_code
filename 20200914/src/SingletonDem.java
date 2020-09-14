//饿汉模式
 public class SingletonDem {
    private static SingletonDem instance = new SingletonDem();
    private SingletonDem() {

    }
    public static SingletonDem getInstance() {
        return instance;
    }
}
