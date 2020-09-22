public class TestDemo {

    /**
     * 数组内数据循环平移
     * @param arr int整型一维数组 输入数组
     * @param pushOffset int整型 位移长度
     * @return int整型一维数组
     */
    public int[] pushIntArray (int[] arr, int pushOffset) {
        // write code here
        while(pushOffset > 0){
            runArray(arr);
            pushOffset--;
        }
        return arr;
    }
    public int[] runArray(int[] arr) {
        int tmp = arr[arr.length-1];
        for(int i = arr.length-2; i >=0 ; i--){
            arr[i+1] = arr[i];
        }
        arr[0] = tmp;
        return arr;
    }

}
