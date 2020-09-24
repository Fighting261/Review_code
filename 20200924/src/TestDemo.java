import java.util.Arrays;
import java.util.Scanner;

public class TestDemo {

    //输出两个相加和为目标数组的数
    public static void main1(String[] args){
        int[] arr = {2,3,4,5,8};
        int target = 7;
        int left = 0;
        int right = arr.length - 1;
        Arrays.sort(arr);
        while(left < right){
            int num = arr[left] + arr[right];
            if(num > target){
                right--;
            }else if(num < target){
                left++;
            }else{
                System.out.println(arr[left] + "," + arr[right]);
                left++;
                right--;
            }
        }
    }

    //输出不包含“110”的最长字串长度
    public static void main2(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String s = "110";
        int count = 0;
        int max = 0;
        for(int i = 0; i < str.length()-2; i++){
            if(!str.substring(i,i+3).equals(s)){
                count++;
                if(count > max){
                    max = count;
                }
            }else{
                count = 0;
            }
        }
        System.out.println(max+2);
    }


/*    有n个人排成一条直线，从左到右编号分别为1到n。现在从第1个人开始报数，在报数过程中，如果有人报到m则出列，下一个人将继续从1开始报数。
    第n个人报数完之后再接着往回报数，即倒数第2个人继续报下一个数；当报到第1个人后，第2个人再接着报数。如此循环，直到只留下一个人为止。
    例如当n=2，m=3时，第1个人报1，第2个人报2，接下来第1个人报3，出列，留下第2个人。
    当输入n和m时，请问通过（n-1）轮报数后，最后留下的那个人的编号是多少？*/
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = i+1;
        }
        Boolean bool = true;
        int tmp = m;
        int count = 0;
        int num = 0;
        if(bool){
            for(int i = 0; i < arr.length; i++){
                if(tmp!=0 && arr[i]!=0){
                    tmp--;
                    if(tmp == 0){
                        tmp=m;
                    }
                }else{
                    arr[i]=0;
                    count++;
                }
                if(count == arr.length - 1){
                    num = i;
                    break;
                }
                bool = false;
            }
        }else{
            for(int j = arr.length-2; j > 0 ; j--){
                if(tmp!=0 && arr[j]!=0){
                    tmp--;
                    if(tmp == 0){
                        tmp=m;
                    }
                }else{
                    arr[j]=0;
                    count++;
                }
                if(count == arr.length - 1){
                    num = j;
                    break;
                }
                bool = true;
            }

        }
        System.out.println(num+1);
    }
}
