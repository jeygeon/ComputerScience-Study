package sort.selection;

public class SelectionSort {

    public static void sort(int[] arr) {

        int minData;
        int index;
        for (int i = 0; i < arr.length - 1; i++) {
            minData = arr[i];
            index = i;

            // 배열에서 최솟값을 찾고 그 자리 index을 정한다.
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < minData) {
                    minData = arr[j];
                    index = j;
                }
            }

            // 위의 for문에서 찾은 최솟값과 arr[i] 자리의 위치를 바꾼다
            arr[index] = arr[i];
            arr[i] = minData;
        }
    }
}
