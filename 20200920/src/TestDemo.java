import java.util.*;
public class TestDemo{

    //输入描述:输入包含两个字符串，都仅包含大写字母，每一种字母代表一种颜色。 第一个字符串S代表小A手上的颜料，第二个字符串T代表画需要的颜料。
    //输出描述:输出包含一个数，即最多能涂多少个色块。
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine(); //手上的颜料
        String T = sc.next();  //需要的颜料
        int count = 0; //记录能涂的色块数量
        HashMap<Character,Integer>map = new HashMap<>();
        for(int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }
        for(int i = 0; i < T.length(); i++){
            char c = T.charAt(i);
            if((map.getOrDefault(c,-1) > 0)){
                count++;
                map.put(c,map.get(c)-1);
            }
        }
        System.out.println(count);
    }
}