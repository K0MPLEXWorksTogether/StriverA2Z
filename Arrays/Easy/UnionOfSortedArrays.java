package Arrays.Easy;

import java.util.ArrayList;

public class UnionOfSortedArrays {
    public ArrayList<Integer> union(int[] arr1, int[] arr2) {
        ArrayList<Integer> union = new ArrayList<>();
        int i = 0, j = 0;
        int m = arr1.length, n = arr2.length;

        while (i < m && j < n) {
            if (arr1[i] <= arr2[j]) {
                if (union.size() == 0 || union.get(union.size() - 1) != arr1[i]) {
                    union.add(arr1[i]);
                }
                i++;
            } else {
                if (union.size() == 0 || union.get(union.size() - 1) != arr2[j]) {
                    union.add(arr2[j]);
                }
                j++;
            }
        }

        while (i < m) {
            if (union.size() == 0 || union.get(union.size() - 1) != arr1[i]) {
                union.add(arr1[i]);
            }
            i++;
        }

        while (j < n) {
            if (union.size() == 0 || union.get(union.size() - 1) != arr2[j]) {
                union.add(arr2[j]);
            }
            j++;
        }

        return union;
    }

    public static void main(String[] args) {
        UnionOfSortedArrays unionOfSorted = new UnionOfSortedArrays();
        int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int arr2[] = { 2, 3, 4, 4, 5, 11, 12 };

        ArrayList<Integer> union = unionOfSorted.union(arr1, arr2);
        System.out.println("Union:");
        for (int val : union) {
            System.out.printf("%d ", val);
        }
        System.out.println();
    }
}
