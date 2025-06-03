package Arrays.Easy;

public class RotateByOnePlace {
    public void rotateByOnePlace(int[] arr) {
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;
    }

    public static void main(String[] args) {
        RotateByOnePlace rotate = new RotateByOnePlace();
        int arr[] = { 1, 2, 3, 4, 5 };
        rotate.rotateByOnePlace(arr);

        for (int num : arr) {
            System.out.printf("%d ", num);
        }
        System.out.println();
    }
} 
