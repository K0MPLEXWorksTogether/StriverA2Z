package Arrays.Hard;

public class RepeatingAndMissing {
    public int[] repeatingAndMissing(int[] arr) {
        int n = arr.length;
        long S = (long) n * (n + 1) / 2;
        long S2 = (long) n * (n + 1) * (2L * n + 1) / 6;

        long Sn = 0, Sn2 = 0;
        for (int num : arr) {
            Sn += num;
            Sn2 += num * num;
        }
        
        long diff = Sn - S; // R - M
        long sqDiff = Sn2 - S2; // R^2 - M^2 = (R + M)(R - M)
        long sum = sqDiff / diff; // (R + M)

        long R = (diff + sum) / 2; // (R - M) + (R + M)
        long M = (sum - diff) / 2; // (R + M) - (R - M)
        return new int[] {(int)R, (int)M};
    }
}
