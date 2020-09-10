import java.util.*;


public class TestDemo {
    //计算组合数
    public int combination (int r, int n) {
        // write code here
        int a = fac1(r,n);
        int b = fac2((n-r));
        return a/b;
    }

    public int fac1(int a,int b) {
        int sum = 1;
        for(int i = b; i > b-a; i--) {
            sum *= i;
        }
        return sum;
    }

    public int fac2(int a) {
        int sum = 1;
        for(int i = 1; i <= a; i++) {
            sum *= i;
        }
        return sum;
    }

    //合并两个有序数组
    public static int[] arrayMerge (int[] array1, int m, int[] array2, int n) {
        // write code here
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        int[] array = new int[k+1];
        while(i >= 0 && j >= 0) {
            if(array1[i] > array2[j]) {
                array[k--] = array1[i--];
            }else {
                array[k--] = array2[j--];
            }
        }
            while(i >= 0) {
                array[k--] = array1[i--];
            }
            while(j >= 0) {
                array[k--] = array2[j--];
            }
        return array;
    }


}