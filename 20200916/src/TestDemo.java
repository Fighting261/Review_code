import java.util.Scanner;
//1.计算最大和
//2.密文破译
//3.出钱方案
public class TestDemo {
    //循环输出数组
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for(int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        int begin = sc.nextInt();
        int count = sc.nextInt();
        Boolean bool = true;

        for(int i = begin; i < len; i++) {
            System.out.println(arr[i]);
            count--;
            if(count == 0) {
                break;
            }
        }
        while(count > 0) {
            if(bool) {
                for(int j = len - 2; j > 0; j--) {
                    System.out.println(arr[j]);
                    if(count > 0) {
                        count--;
                        if(count == 0) {
                            break;
                        }
                    }
                    bool = false;
                }
            }else {
                for(int i = 0; i < len; i++) {
                    System.out.println(arr[i]);
                    count--;
                    if(count == 0) {
                        break;
                    }
                }
                bool = true;
            }
        }
    }

    //发工资
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();
        int[] arr = {1,5,10,20,100};
        int i = 4;
        int num = arr[i];
        int count = 0;
        while(salary > 0) {
            if(salary >= num) {
                salary -= num;
                count++;
            }else {
                num = arr[i--];
            }
        }
        System.out.println(count);
    }
}
