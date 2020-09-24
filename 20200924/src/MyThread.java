
public class MyThread extends Thread{

    @Override
    public void run() {
        super.run();
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}


