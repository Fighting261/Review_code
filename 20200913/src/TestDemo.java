import java.util.Scanner;

/**
 * @ program: 20200913
 * @ Description：
 * @ CreateTime：2020/9/13 15:24
 * @ Author：Mr Zhang
 */
public class TestDemo {
    //写两个线程，一个线程打印1-52，另一个线程打印A-Z，打印顺序是12A34B...5152Z;
    //打印结果:
    //12A34B56C78D910E1112F1314G1516H171819202122/12324L2526M2728N293003132P333403536R3738$3940T4142U4344546W4748X4950Y5152Z
public static class ThreadPrinter {
     // true打印数字，false打印字母
     private boolean flag = true;

     // 打印字母
    public synchronized void printNumber(String s) {
         try {
             if (!flag) {
                 super.wait();
            }
             System.out.print(s);
             flag = false;
             super.notifyAll();
         } catch (InterruptedException ex) {
         }
     }
     // 打印数字
     public synchronized void printLetter(String s) {
         try {
           if (flag) {
                 super.wait();
             }
             System.out.print(s);
           flag = true;
             super.notifyAll();
         } catch (InterruptedException ex) {
         }
     }

     /**
      *线程2:打印A-Z
      */
     public static class LetterPrintThread extends Thread {
         private ThreadPrinter printer;

         private LetterPrintThread(String name, ThreadPrinter printer) {
             super(name);
             this.printer = printer;
         }

         @Override
         public void run() {
             for (int i = 1; i <= 26; i++) {
                 int temp = i + 64;
                 char c = (char) temp;
                 printer.printLetter(c + "");
             }
         }

     }

     /**线程1:打印1-52*/
     public static class NumberPrintThread extends Thread {
         private ThreadPrinter printer;

         private NumberPrintThread(String name, ThreadPrinter printer) {
             super(name);
             this.printer = printer;
         }
         @Override
         public void run() {
             for (int i = 1; i <= 26; i++) {
                 String s = (2 * i - 1) + "" + 2 * i ;
                 printer.printNumber(s);
             }
         }
     }

     public static void main(String[] args) {
         ThreadPrinter printer = new ThreadPrinter();
         new NumberPrintThread("打印数字线程", printer).start();
         new LetterPrintThread("打印字母线程", printer).start();
     }
 }

    //字符串习题
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        String newStr = "";
        for(int i = 0; i < str.length(); i += n) {
            if(str.length()-1-i >= n){
                String s = str.substring(i,i+n);
                for(int j = s.length()-1; j >= 0; j--) {
                    newStr += s.charAt(j);
                }
            }else {
                String s = str.substring(i);
                for(int j = s.length()-1; j >= 0; j--) {
                    newStr += s.charAt(j);
                }
            }
        }
        System.out.println(newStr);
    }
}
