package Arrays.Medium;

import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] arr, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (map.containsKey(complement)) {
                result[0] = map.get(complement);
                result[1] = i;
                break;
            } else {
                map.put(arr[i], i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] test = {3, 2, 4};
        int[] result = twoSum(test, 6);

        System.out.println("Result");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
