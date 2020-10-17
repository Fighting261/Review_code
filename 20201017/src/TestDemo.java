import java.util.Scanner;

public class TestDemo {
    //计算当前星期
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");  // 2020 8 10 3 2020 8 11
        int[] arr = new int[7];
        for(int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(str[i]);
        }
        int[] month = {30,27,30,29,30,29,30,30,29,30,29,30};
        int year = arr[0];
        int years = arr[4];
        int day = 0;
        while(year < years){
            if((year % 4 == 0 || year % 400 ==0) && (year %100 != 0)){
                month[1] = 28;
            }
            day += 353;
            year++;
        }
        if((year % 4 == 0 || year % 400 ==0) && (year %100 != 0)){
            month[1] = 28;
        }

        int month1 = arr[1];
        int month2 = arr[5];
        int daySub = arr[6] - arr[2];
        while(month1 < month2){
            day += month[month1-1];
            month1++;
        }
        day += daySub;
        day += arr[3];
        System.out.println(day%7);
    }
}
