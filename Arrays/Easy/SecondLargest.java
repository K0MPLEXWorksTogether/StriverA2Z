package Arrays.Easy;

public class SecondLargest {
    public int secondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] < largest) {
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 7, 7, 5 };
        SecondLargest second = new SecondLargest();
        int sL = second.secondLargest(arr);
        System.out.println("Second largest is " + sL);
    }
}
