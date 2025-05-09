package Sorting;

public class RecursiveBubbleSort {
    public static void recursiveBubbleSort(int[] arr, int n) {
        if (n == 1)
            return;

        int didSwap = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                didSwap = 1;
            }
        }

        if (didSwap == 0)
            return;

        recursiveBubbleSort(arr, n - 1);
    }
    
    public static void main(String[] args) {
        int[] array = { 13, 46, 24, 52, 20, 9 };
        System.out.println("Before Sort:");
        for (int i : array) {
            System.out.printf("%d ", i);
        }
        System.out.println();

        recursiveBubbleSort(array, array.length);

        System.out.println("After Sort:");
        for (int i : array) {
            System.out.printf("%d ", i);
        }
        System.out.println();
    }
}
