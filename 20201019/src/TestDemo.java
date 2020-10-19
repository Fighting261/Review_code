import java.util.*;
public class TestDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];

        List<String> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.next();
            list.add(arr[i]);
        }

        Collections.sort(list,new myComparator1());
        for(int i = 0; i < list.size() - 1; i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println(list.get(list.size()-1));

        Collections.sort(list,new myComparator2());
        for(int i = 0; i < list.size() - 1; i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println(list.get(list.size()-1));
    }

    public static class myComparator1 implements Comparator{
        @Override
        public int compare(Object o1, Object o2) {
            String s1 = o1.toString();
            String s2 = o2.toString();
            return s1.compareTo(s2);
        }
    }

    public static class myComparator2 implements Comparator<String>{
        @Override
        public int compare(String o1, String o2) {
            int len1 = o1.length();
            int len2 = o2.length();
            return len1 - len2;
        }
    }
}