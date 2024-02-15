package sort.quick;

public class QuickSort {
    
    public static void sort(int[] arr, int rowIndex, int highIndex) {

        if (rowIndex >= highIndex) {
            return;
        }

        int paritionIndex = partition(arr, rowIndex, highIndex);
        sort(arr, rowIndex, paritionIndex - 1);
        sort(arr, paritionIndex + 1, highIndex);
    }

    private static int partition(int[] arr, int rowIndex, int highIndex) {
        int pivotIndex = rowIndex;
        int pivot = arr[pivotIndex];

        while (rowIndex < highIndex) {

            // row가 pivot보다 같거나 커질 때 까지 row 증가 
            while (arr[rowIndex] <= pivot && rowIndex < highIndex) {
                rowIndex++;
            }

            // high가 pivot보다 작아질 때 까지 high 감소
            while (arr[highIndex] > pivot && rowIndex <= highIndex) {
                highIndex--;
            }

            // row와 high가 엇갈리면 high와 pivot 교환
            if (rowIndex >= highIndex) {
                swap(arr, pivotIndex, highIndex);
                break;
            }

            // row와 high가 엇갈리지 않으면 row와 high 교환
            if (rowIndex < highIndex) {
                swap(arr, rowIndex, highIndex);
            }
        }

        return highIndex;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}