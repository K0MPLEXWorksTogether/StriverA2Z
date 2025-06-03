package Arrays.Easy;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int xorSum = 0;
        for (int num : nums) {
            xorSum ^= num;
        }

        return xorSum;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 2, 1 };
        System.out.println(singleNumber(arr));
    }
}
