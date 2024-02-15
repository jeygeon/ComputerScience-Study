package sort.quick;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arr = {7, 3, 8, 1, 5, 2, 9, 4, 6, 10};
        
        QuickSort.sort(arr, 0, arr.length - 1);
        
        System.out.println(Arrays.toString(arr));
    }

}
