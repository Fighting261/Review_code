import java.util.ArrayList;
import java.util.Scanner;

/**
 * @ program: 20200814
 * @ Description：
 * @ CreateTime：2020/8/14 21:41
 * @ Author：Mr Zhang
 */
public class TestDemo {

    //读入一个字符串str，输出字符串str中的连续最长的数字串
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String str = sc.nextLine();
            int count = 0;
            int max = 0;
            int end = 0;
            for(int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if(ch >= '0' && ch <= '9') {
                    count++;
                    if(max < count){
                        max = count;
                        end = i;
                    }
                }else {
                    count = 0;
                }
            }
            String newstr = str.substring(end - max + 1,end + 1);
            System.out.println(newstr);
        }
    }

    //输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(input == null || k <= 0 || k > input.length){
            return list ;
        }
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < input.length - i - 1; j++) {
                if (input[j] < input[j + 1]) {
                    int temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                }
            }
            list.add(input[input.length - i - 1]);
        }
        return list;
    }
}
