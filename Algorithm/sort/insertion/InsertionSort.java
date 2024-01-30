package sort.insertion;

public class InsertionSort {

    public static void sort(int[] arr) {

        int j;
        int data;
        for (int i = 1; i < arr.length; i++) {

            j = i;
            data = arr[i];
            while (j > 0 && arr[j - 1] > data) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = data;
        }
    }
}
