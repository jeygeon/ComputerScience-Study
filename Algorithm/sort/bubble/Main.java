package sort.bubble;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		int[] arr = {9, 3, 7, 19, 5, 14};

		BubbleSort.sort(arr);

		System.out.println(Arrays.toString(arr)); // 결과 : [3, 5, 7, 9, 14, 19]
	}

}
