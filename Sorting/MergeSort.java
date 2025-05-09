package Sorting;

import java.util.ArrayList;

public class MergeSort {
    private void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }

    public void mergeSort(int[] arr, int left, int right) {
        if (left >= right)
            return;
        int mid = (left + right) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    public static void main(String[] args) {
        int[] array = { 13, 46, 24, 52, 20, 9 };
        System.out.println("Before Sort:");
        for (int i : array) {
            System.out.printf("%d ", i);
        }
        System.out.println();

        MergeSort sort = new MergeSort();
        sort.mergeSort(array, 0, array.length - 1);

        System.out.println("After Sort:");
        for (int i : array) {
            System.out.printf("%d ", i);
        }
        System.out.println();
    }
}
