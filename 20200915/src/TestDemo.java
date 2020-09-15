import java.util.*;

public class TestDemo {

    //给定一个字符串, 需要去除所有之前曾经出现过的字符，只保留第一次出现的字符
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashSet set = new HashSet();
        String newStr = "";
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(!set.contains(ch)) {
                newStr += ch;
                set.add(ch);
            }else {
                continue;
            }
        }
        System.out.println(newStr);
    }

    //字符串有效判断
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String str = sc.nextLine();
            Boolean bool = false;
            Stack<Character> st = new Stack<>();
            if(str == null) {
                bool = true;
            }
            for(int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if(st.isEmpty()) {    //()[]{}
                    st.push(ch);
                }else if(st.peek() == '(' && ch == ')' ||
                        st.peek() == '[' && ch == ']' ||
                        st.peek() == '{' && ch == '}' ) {
                    st.pop();
                }else {
                    st.push(ch);
                }
            }
            if(st.isEmpty()) {
                bool = true;
            }else {
                bool = false;
            }
            System.out.println(bool);
        }
    }
}
