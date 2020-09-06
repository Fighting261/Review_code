/**
 * @ program: 20200906
 * @ Description：
 * @ CreateTime：2020/9/6 16:07
 * @ Author：Mr Zhang
 */
public class TestDemo {

    //给定一个string iniString，请返回一个string，为翻转后的字符串。
    public String reverseString(String iniString) {
        // write code here
        char[] a = iniString.toCharArray();
        for(int i = 0; i < a.length/2; i++) {
            char tmp = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = tmp;
        }
        return new String(a);
    }

    //给定一个string iniString，请返回一个bool值,True代表所有字符全都不同，False代表存在相同的字符。
    public boolean checkDifferent(String iniString) {
        // write code here
        boolean result = true;
        String input = iniString;
        for(int i = 0;i<input.length()-1;i++){
            if(input.indexOf(input.charAt(i),i+1)!= -1){
                result = false;
            }
        }
        return result;
    }

    //给定一个string stringA和一个string stringB，请返回一个bool，代表两串是否重新排列后可相同。
    public boolean checkSam(String stringA, String stringB) {
        // write code here
        if(stringA.length() != stringB.length()) {
            return false;
        }
        int[] a = new int[128];
        int[] b = new int[128];
        for(int i = 0; i < stringA.length(); i++) {
            a[stringA.charAt(i)]++;
            b[stringB.charAt(i)]++;
        }
        for(int i = 0; i < 128; i++) {
            if(a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
}
