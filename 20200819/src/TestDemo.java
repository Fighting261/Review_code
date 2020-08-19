/**
 * @ program: 20200819
 * @ Description：
 * @ CreateTime：2020/8/19 20:28
 * @ Author：Mr Zhang
 */
public class TestDemo {

    //现有一个小写英文字母组成的字符串s和一个包含较短小写英文字符串的数组p，请设计一个高效算法，对于p中的每一个较短字符串，判断其是否为s的子串。
    public boolean[] chkSubStr(String[] p, int n, String s) {
        // write code here
        boolean[] arr = new boolean[n];
        for(int i = 0; i < n; i++) {
            if(s.contains(p[i])) {
                arr[i] = true;
            }else {
                arr[i] = false;
            }
        }
        return arr;
    }

    //给定两个字符串s1和s2，请编写代码检查s2是否为s1旋转而成
    //思路：s1拼接自己一次当作s3，s2如果是s1旋转来的就必定是s3的子串
    public boolean checkReverseEqual(String s1, String s2) {
        // write code here
        if(s1.length()==0 || s2.length()==0 || s1.length()!=s2.length()) {
            return false;
        }
        String s = s1+s1;
        if(s.contains(s2)) {
            return true;
        }
        return false;
    }
}
