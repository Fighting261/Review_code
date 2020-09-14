
//懒汉模式
public class SingletonDemo {
    private static SingletonDemo instance;
    private SingletonDemo() {

    }
    public static SingletonDemo getInstance() {
        if(instance == null) {
            instance = new SingletonDemo();
        }
        return instance;
    }
}

