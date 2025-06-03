package Arrays.Easy;

public class MaximumProductSubarray {
    public static int maximumProductSubarray(int[] arr) {
        int max = Integer.MIN_VALUE;
        int prefixProd = 1;
        int suffixProd = 1;

        for (int i = 0, j = arr.length - 1; i < arr.length && j > -1; i++, j--) {
            if (prefixProd == 0) {
                prefixProd = 1;
            } else if (suffixProd == 1) {
                suffixProd = 1;
            }

            prefixProd *= arr[i];
            suffixProd *= arr[i];

            max = Math.max(prefixProd, max);
            max = Math.max(suffixProd, max);
        }
        
        return max;
    }
}
