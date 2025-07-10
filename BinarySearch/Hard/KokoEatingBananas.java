package BinarySearch.Hard;

public class KokoEatingBananas {
    public int binarySearch(int[] piles, int left, int right, int hours) {
        int result = right;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (countBananas(piles, mid) <= hours) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return result;
    }

    public int countBananas(int[] piles, int speed) {
        int hours = 0;
        for (int bananas : piles) {
            hours += Math.ceil((bananas + speed - 1) / speed);
        }

        return hours;
    }

    public int kokoEatingBananas(int[] piles, int hours) {
        int max = 0;
        for (int pile : piles) {
            max = Math.max(max, pile);
        }
        return binarySearch(piles, 1, max, hours);
    }
}
