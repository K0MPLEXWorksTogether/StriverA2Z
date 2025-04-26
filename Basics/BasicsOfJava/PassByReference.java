package Basics.BasicsOfJava;

public class PassByReference {
    public void reverse(int[] arr) {
        int l = 0;
        int r = arr.length - 1;

        while (l <= r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

            l++;
            r--;
        }
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        PassByReference test = new PassByReference();
        System.out.println("Before Reversal:");
        for (int num : array) {
            System.out.printf("%d ", num);
        }

        test.reverse(array);
        System.out.println("\nAfter Reversal:");
        for (int num : array) {
            System.out.printf("%d ", num);
        }
    }
}
