package Arrays.Easy;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int zeroes = 0;
        int ptr = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroes++;
            } else {
                nums[ptr] = nums[i];
                ptr++;
            }
        }

        while (zeroes > 0) {
            nums[ptr] = 0;
            ptr++;
            zeroes--;
        }
    }

    public static void main(String[] args) {
        MoveZeroes zeroes = new MoveZeroes();
        int[] arr = { 0, 1, 0, 3, 12 };
        zeroes.moveZeroes(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.out.println();
    }
}
