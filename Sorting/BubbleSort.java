package Sorting;

public class BubbleSort {
    public void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            if(!swapped){
                return;
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

        BubbleSort sort = new BubbleSort();
        sort.bubbleSort(array);

        System.out.println("After Sort:");
        for (int i : array) {
            System.out.printf("%d ", i);
        }
        System.out.println();
    }
}
