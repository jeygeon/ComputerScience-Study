package sort.selection;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		int[] arr = {15, 10, 17, 3, 8, 2};

		SelectionSort.sort(arr);

		System.out.println(Arrays.toString(arr)); // 결과 : [2, 3, 8, 10, 15, 17]
	}

}
