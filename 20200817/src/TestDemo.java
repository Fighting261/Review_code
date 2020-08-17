import java.util.Scanner;

/**
 * @ program: 20200817
 * @ Description：
 * @ CreateTime：2020/8/17 12:50
 * @ Author：Mr Zhang
 */
public class TestDemo {

    //对于任意两个正整数x和k,我们定义repeat(x, k)为将x重复写k次形成的数,例如repeat(1234, 3) = 123412341234,repeat(20,2) = 2020.
    //牛牛现在给出4个整数x1, k1, x2, k2, 其中v1 = (x1, k1), v2 = (x2, k2),请你来比较v1和v2的大小。
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int x1 = sc.nextInt();
            int k1 = sc.nextInt();
            int x2 = sc.nextInt();
            int k2 = sc.nextInt();
            long v1 = repeat(x1,k1);
            long v2 = repeat(x2,k2);
            if(v1 > v2) {
                System.out.println("Greater");
            }else if(v1 == v2) {
                System.out.println("Equal");
            }else {
                System.out.println("Less");
            }
        }
    }

    public static long repeat(int x,int k) {
        long count = x;
        while(k > 1) {
            int tmp = x;
            while(tmp > 0) {
                count *= 10;
                tmp /=10;
            }
            count =count + x;
            k--;
        }
        return count;
    }

    //计算字符串最后一个单词的长度，单词以空格隔开。
    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String str = sc.nextLine();
            String[] arr = str.split(" ");
            String s = arr[arr.length - 1];
            System.out.println(s.length());
        }
    }

    public String replaceSpace(String iniString, int length) {
        //字符串生成字符数组
        char[] ch = iniString.toCharArray();
        if(length <= 0) {
            return null;
        }
        int mLen = 0;//计算字符的个数
        int numBlank = 0;//计算空格的数组
        int i = 0;//从0号下标开始遍历
        while(i < ch.length) {
            if(ch[i] == ' ') {
                ++numBlank;
            }
            ++i;
        }
        //替换为%20之后，新数组的长度。
        int newlen = length + numBlank * 2;//a%20b%20c%20d a b c d
        //新的数组
        char []ch2 = new char[newlen];
        //先把ch里面的内容，全部拷贝到ch2,我们要在ch2里面进行操作。
        int index1 = length-1;//也必须减一
        int index2 = newlen-1;//不减一就越界了
        while (index1 >= 0) {
            if (ch[index1] == ' ') {
                ch2[index2--] = '0';
                ch2[index2--] = '2';
                ch2[index2--] = '%';
                index1--;
            } else {
                ch2[index2--] = ch[index1--];
            }
        }
        return String.valueOf(ch2);
    }
}
