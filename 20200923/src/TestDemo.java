import java.util.*;
public class TestDemo{
    //从m个人里挑选n个人有多少种办法
    public static void main1(String[] args){
        Scanner sc = new Scanner(System.in);
        long m = sc.nextInt();
        long n = sc.nextInt();
        long a = 1;
        long b = 1;
        long p = 0;
        for(int i = 0; i < n; i++) {
            a *= (m-i);
        }
        for(int j = 1; j <= n; j++) {
            b *= j;
        }
        System.out.println(a/b);
    }

    //输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        for(int i = 0; i < ch.length; i++){
            if((ch[i] <= 'z' && ch[i] >= 'a') || (ch[i] <= 'Z' && ch[i] >= 'A')){
                a++;
            }else if(ch[i] >= '0' && ch[i] <= '9'){
                b++;
            }else if(ch[i] == ' '){
                c++;
            }else{
                d++;
            }
        }
        System.out.println("字母个数：" + a);
        System.out.println("数字个数：" + b);
        System.out.println("空格字数：" + c);
        System.out.println("其他字符：" + d);
    }
}