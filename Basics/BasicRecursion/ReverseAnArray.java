package Basics.BasicRecursion;

public class ReverseAnArray {
    public void reverseAnArray(int[] array, int i) {
        if (i >= array.length / 2) {
            return;
        }

        int temp = array[i];
        array[i] = array[array.length - i - 1];
        array[array.length - 1 - i] = temp;
        reverseAnArray(array, i + 1);
    }

    public static void main(String[] args) {
        ReverseAnArray test = new ReverseAnArray();
        int[] arr = { 1, 2, 3, 4, 5 };
        test.reverseAnArray(arr, 0);

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.println();
    }
}
