package Arrays.Medium;

public class MajorityElement {
    public static int majority(int[] arr) {
        int element = 0;
        int count = 0;

        for (int i : arr) {
            if (count == 0) {
                element = i;
                count++;
            } else if (element == i) {
                count++;
            } else {
                count--;
            }
        }

        return element;
    }
}
