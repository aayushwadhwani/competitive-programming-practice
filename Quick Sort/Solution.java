import java.util.Arrays;

class QuickSort {
    public int selectMedian(int[] arr, int start, int end, int k) {
        int pivot = partition(arr, start, end);
        if (k == pivot) {
            return arr[k];
        }
        if (pivot < k) {
            return selectMedian(arr, pivot + 1, end, k);
        } else {
            return selectMedian(arr, start, pivot - 1, k);
        }
    }

    public void sort(int[] arr, int start, int end) {
        if (start < end) {
            int pivot = partition(arr, start, end);
            sort(arr, start, pivot - 1);
            sort(arr, pivot + 1, end);
        }
    }

    public int partition(int[] arr, int start, int end) {
        int pivot = arr[start];
        int i = start;
        int j = end;
        while (i < j) {
            while (i < arr.length && arr[i] <= pivot) {
                i++;
            }
            while (j > -1 && arr[j] > pivot) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int pivotPosition = j; // 3

        int temp = pivot;
        arr[start] = arr[j];
        arr[pivotPosition] = temp;
        return pivotPosition;
    }
}

class Solution {
    public static void main(String[] args) {
        int[] arr = new int[] { 1155, 64, 138, 1215, 257, 1012, 1199, 594, 555, 92, 101010 };
        int[] arr2 = new int[] { 1155, 64, 138, 1215, 257, 1012, 1199, 594, 555, 92, 101010 };
        QuickSort obj = new QuickSort();
        System.out.println(obj.selectMedian(arr2, 0, arr2.length - 1, arr2.length / 2));
        obj.sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}