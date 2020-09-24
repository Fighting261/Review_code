import java.util.regex.MatchResult;

public class MyThread2 implements Runnable {//实现Runnable接口

    //重写run方法
    public void run(){

    }

    public static void main(String[] args){
        //创建并启动线程
        MyThread2 myThread=new MyThread2();

        Thread thread=new Thread(myThread);

        thread.start();

       //new Thread(new MyThread2()).start();

    }
}


