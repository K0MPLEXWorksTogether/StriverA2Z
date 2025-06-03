package Arrays.Easy;

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxOnes = 0;
        int currOnes = 0;

        for (int num : nums) {
            if (num == 0) {
                maxOnes = Math.max(currOnes, maxOnes);
                currOnes = 0;
            } else {
                currOnes++;
            }
        }

        return Math.max(currOnes, maxOnes);
    }
    public static void main(String[] args) {
        MaxConsecutiveOnes ones = new MaxConsecutiveOnes();
        int[] nums = { 1, 1, 0, 1, 1, 1 };

        System.out.println(ones.findMaxConsecutiveOnes(nums));
    }
}
