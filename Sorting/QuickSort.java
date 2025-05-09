package Sorting;

public class QuickSort {
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int left = low;
        int right = high;

        while (left < right) {
            while (arr[left] <= pivot && left < high) {
                left++;
            }

            while (arr[right] > pivot && right > low) {
                right--;
            }

            if (left < right)
                swap(arr, left, right);
        }

        swap(arr, low, right);
        return right;
    }
    
    public void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot);
            quickSort(arr, pivot + 1, high);
        }
    }

    public static void main(String[] args) {
        QuickSort quick = new QuickSort();
        int[] arr = { 4, 6, 2, 5, 7, 9, 1, 3 };

        System.out.println("Before Sort:");
        for (int num : arr) {
            System.out.printf("%d ", num);
        }
        System.out.println();

        quick.quickSort(arr, 0, arr.length - 1);

        System.out.println("After Sort:");
        for (int num : arr) {
            System.out.printf("%d ", num);
        }
        System.out.println();
    }
}
