package Sorting;

public class InsertionSort {
    public void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = { 13, 46, 24, 52, 20, 9 };
        System.out.println("Before Sort:");
        for (int i : array) {
            System.out.printf("%d ", i);
        }
        System.out.println();

        InsertionSort sort = new InsertionSort();
        sort.insertionSort(array);

        System.out.println("After Sort:");
        for (int i : array) {
            System.out.printf("%d ", i);
        }
        System.out.println();
    }
}
