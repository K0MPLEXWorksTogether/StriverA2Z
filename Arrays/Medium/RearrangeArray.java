package Arrays.Medium;

public class RearrangeArray {
    public static int[] rearrangeArray(int[] nums) {
        int[] rearranged = new int[nums.length];
        int startPos = 0;
        int startNeg = 1;

        for (int i : nums) {
            if (i > 0) {
                rearranged[startPos] = i;
                startPos += 2;
            } else {
                rearranged[startNeg] = i;
                startNeg += 2;
            }
        }

        return rearranged;
    }

    public static void main(String[] args) {
        int[] test = { 3, 1, -2, -5, 2, -4 };
        int[] rearranged = rearrangeArray(test);

        System.out.println("Rearranged Array:");
        for (int i : rearranged) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
