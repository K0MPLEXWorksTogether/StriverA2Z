package Arrays.Easy;

public class Largest {
    public static int largest(int[] arr) {
        if (arr.length == 0) {
            return 0;
        } else if (arr.length == 1) {
            return arr[0];
        } else {
            int max = arr[0];
            for (int num : arr) {
                if (num > max) {
                    max = num;
                }
            }

            return max;
        }
    }

    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Largest large = new Largest();
        int[] arr = { 13, 46, 24, 52, 20, 9 };

        System.out.println("Array: ");
        large.printArray(arr);

        System.out.println("Largest Element: " + largest(arr));
    }
}
