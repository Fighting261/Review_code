/**
 * @ program: 20200804
 * @ Description：最大公因数、判断是否是素数
 * @ CreateTime：2020/8/4 21:31
 * @ Author：Mr Zhang
 */
public class TestDemo {
    //辗转取余法求两个数的最大公因数
    public static int GreatestCommonFactor(int x,int y) {
      int m = 0;
        while(y != 0) {
            m = x % y;
            x = y;
            y = m;
        }
        return x;
    }

    //判断一个数是否是素数
    public static boolean IsPrimeNumber(int x) {
        for(int i = 2; i < Math.sqrt(x); i += 2) {
            if(x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(GreatestCommonFactor(12, 6));
    }
}
