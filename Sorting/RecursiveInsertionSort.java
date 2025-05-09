package Sorting;

public class RecursiveInsertionSort {
    public static void recursiveInsertionSort(int[] arr, int i) {
        int n = arr.length;
        if (i >= n) {
            return;
        }

        int j = i;
        while (j > 0 && arr[j] < arr[j - 1]) {
            int temp = arr[j - 1];
            arr[j - 1] = arr[j];
            arr[j] = temp;
            j--;
        }

        recursiveInsertionSort(arr, i + 1);

    }
    
    public static void main(String[] args) {
        int[] array = { 13, 46, 24, 52, 20, 9 };
        System.out.println("Before Sort:");
        for (int i : array) {
            System.out.printf("%d ", i);
        }
        System.out.println();

        recursiveInsertionSort(array, 0);

        System.out.println("After Sort:");
        for (int i : array) {
            System.out.printf("%d ", i);
        }
        System.out.println();
    }
}
