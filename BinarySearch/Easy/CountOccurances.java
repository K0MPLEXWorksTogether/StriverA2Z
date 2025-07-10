package BinarySearch.Easy;

public class CountOccurances {
    public static int countOccurances(int[] arr, int target) {
        int first = FirstAndLastOccurance.findFirstOccurrence(arr, target);
        if (first == -1) return 0;
        int last = FirstAndLastOccurance.findLastOccurrence(arr, target);
        return last - first + 1;
    }
}
