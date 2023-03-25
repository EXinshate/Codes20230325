public class QuickSort1 {
    public int[] MySort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
        return arr;
    }

    private void quickSort(int[] array, int start, int end) {
        if (start < end) {
            int key = array[start];//用待排数组的第一个作为中枢
            int i = start;
            for (int j = start + 1; j <= end; j++) {
                if (key > array[j]) {
                    swap(array, j, ++i);
                }
            }
            array[start] = array[i];//先挪，然后再把中枢放到指定位置
            array[i] = key;
            quickSort(array, start, i - 1);
            quickSort(array, i + 1, end);
        }
    }

    //交换两个数的值
    public void swap(int[] A, int i, int j) {
        if (i != j) {
            A[i] ^= A[j];
            A[j] ^= A[i];
            A[i] ^= A[j];
        }
    }
}
