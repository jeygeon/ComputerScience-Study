package sort.bubble;

public class BubbleSort {

    public static void sort(int[] arr) {

        int temp;
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {

            swapped = false;
            for (int j = 0; j < arr.length - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }

            }

            /*
             * 이미 정렬된 배열이 들어오거나
             * 정렬도중 한번도 교환이 일어나지 않은 경우
             * 정렬이 완성됬다고 판단 > for문 탈출
             */
            if (!swapped) {
                break;
            }

        }
    }
}
