package Arrays.Easy;

public class LinearSearch {
    public int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        LinearSearch search = new LinearSearch();
        int[] sample = { 1, 2, 3, 4, 5 };
        int target = 3;
        System.out.println("Index Of 3: " + search.linearSearch(sample, target));
    }
}
