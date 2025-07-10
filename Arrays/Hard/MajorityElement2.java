package Arrays.Hard;

import java.util.ArrayList;

public class MajorityElement2 {
    // Boyer-Moore Voting Algorithm
    public static ArrayList<Integer> majorityElement2(int[] nums) {
        Integer candidate1 = null, candidate2 = null;
        int count1 = 0, count2 = 0;
        int n = nums.length;

        for (int num : nums) {
            if (candidate1 != null && num == candidate1) {
                count1++;
            } else if (candidate2 != null && num == candidate2) {
                count2++;
            } else if (candidate1 == null) {
                candidate1 = num;
                count1++;
            } else if (candidate2 == null) {
                candidate2 = num;
                count2++;
            } else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (candidate1 != null && num == candidate1)
                count1++;
            if (candidate2 != null && num == candidate2)
                count2++;
        }
        
        ArrayList<Integer> result = new ArrayList<Integer>();
        if (count1 > n / 3)
            result.add(count1);
        if (count2 > n / 3)
            result.add(count2);

        return result;
    }
}
