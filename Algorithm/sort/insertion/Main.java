package sort.insertion;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arr = {3, 15, 2, 5, 1, 20};

        InsertionSort.sort(arr);

        System.out.println(Arrays.toString(arr)); // 결과 : [1, 2, 3, 5, 15, 20]
    }

}
