package sort.quick;

public class QuickSort {
    
    public static void sort(int[] arr, String type) {

        int pivotIndex = selectPivot(arr, type);
        switch (type) {
            case "left" :
                partition(arr, pivotIndex);
                break;
            }
    }

    private static void partition(int[] arr, int pivotIndex) {
        int row;
        int rowIndex = pivotIndex + 1;
        int high;
        int highIndex = arr.length - 1;
        int pivot;
        while (true) {
            pivot = arr[pivotIndex];
            row = arr[rowIndex];
            high = arr[highIndex];

            // row가 pivot보다 같거나 커질 때 까지 row 증가 
            while (row <= pivot) {
                rowIndex++;
                row = arr[rowIndex];
            }

            // high가 pivot보다 작아질 때 까지 high 감소
            while (high > pivot) {
                highIndex--;
                high = arr[highIndex];
            }

            // row와 high가 엇갈리면 high와 pivot 교환
            if (row > high) {
                swap(arr, pivotIndex, highIndex);
            }

            // row와 high가 엇갈리지 않으면 row와 high 교환
            if (row < high) {
                swap(arr, rowIndex, highIndex);
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static int selectPivot(int[] arr, String type) {

        int pivotIndex = 0;
        switch (type) {
            case "left" :
                pivotIndex = 0;
                break;
            case "right" :
                break;
            case "middle" :
                break;
        }

        return pivotIndex;
    }
}