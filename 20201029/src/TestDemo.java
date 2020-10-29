import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class TestDemo {
    public static void main1(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(c == '(' || c == '{' || c == '['){
                st.push(c);
            }else if(c == ')' && st.peek() == '(' || c == '}' && st.peek() == '{' || c == ']' && st.peek() == '['){
                st.pop();
            }
        }
        System.out.println(st.isEmpty());
    }

    public static void main2(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while(num > 9){
            num = bitAdd(num);
        }
        System.out.println(num);
    }

    private static int bitAdd(int num) {
        if(num < 10){
            return num;
        }
        return num/10 + num%10;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //1,2,4|1,3,4,8,9
        String[] str1 = sc.next().split(",");
        String[] str2 = sc.next().split(",");
        int[] arr = new int[str1.length + str2.length];
        for(int i = 0; i < str1.length; i++){
            arr[i] = Integer.parseInt(str1[i]);
        }
        for(int j = 0; j < str2.length; j++){
            arr[j + str1.length] = Integer.parseInt(str2[j]);
        }
        Arrays.sort(arr);
        for(int i = 0; i < arr.length - 1; i++){
            System.out.print(arr[i] + ",");
        }
        System.out.println(arr[arr.length - 1]);
    }

}
