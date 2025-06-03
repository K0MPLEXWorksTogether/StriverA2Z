package Arrays.Medium;

import java.util.ArrayList;

public class Leaders {
    public static ArrayList<Integer> leaders(int[] arr) {
        ArrayList<Integer> leaders = new ArrayList<>();
        int max = -1;
        int n = arr.length;

        for (int i = n - 1; i > -1; i--) {
            if (arr[i] > max) {
                max = arr[i];
                leaders.add(arr[i]);
            }
        }

        return leaders;
    }
}
