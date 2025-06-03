package Arrays.Easy;

public class MissingNumber {
    public int missingNumber(int[] arr) {
        int xor1 = 0, xor2 = 0;

        for (int i = 0; i < arr.length; i++) {
            xor1 ^= arr[i];
            xor2 ^= i + 1;
        }

        return xor1 ^ xor2;
    }

    public static void main(String[] args) {
        MissingNumber number = new MissingNumber();
        int[] test = { 0, 1, 3, 4, 5 };
        System.out.println(number.missingNumber(test));
    }
}
