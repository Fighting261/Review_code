import java.util.*;
public class TestDemo {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(",");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        while((a & b) != 0){
            int c = a;
            int d = b;
            a = c ^ d;
            b = (c & d) << 1;
        }
        System.out.println(a ^ b);
    }


}
