import java.util.Arrays;

public class TestDemo {

    //插入排序
    public static void insertSort(int[] array) {
        int tmp = 0;
        for (int i = 1; i < array.length; i++) {
            tmp = array[i];
            int j;
            for (j = i-1; j >= 0 ; j--) {
                if(array[j] > tmp) {
                    array[j+1] = array[j];
                }else {
                    break;
                }
            }
            array[j+1] = tmp;
        }
    }

    //选择排序
    public static void selectSort(int [] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            int j;
            // 找出最小值得元素下标
            for (j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            int tmp = arr[index];
            arr[index] = arr[i];
            arr[i] = tmp;
        }
    }

    //冒泡排序
    public static void bubbleSort(int[] array) {
        boolean flg = false;
        //i  表示趟数
        for (int i = 0; i < array.length-1; i++) {
            flg = false;
            for (int j = 0; j < array.length-1-i; j++) {
                if(array[j] > array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    flg = true;
                }
            }
            if(flg == false) {
                return;
            }
        }
    }

}
