class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        // The minimum speed is 1
        int l = 1;

        // The maximum possible speed is the largest pile
        int r = 0;
        for (int p : piles) r = Math.max(r, p);

        while (l < r) {
            int m = l + (r - l) / 2;

            if (canEat(piles, m) <= h) {
                r = m;  // try smaller speed
            } else {
                l = m + 1;  // need bigger speed
            }
        }

        return l;
    }

    // returns hours needed if Koko eats at speed k
    public int canEat(int[] piles, int k) {
        int hours = 0;
        for (int p : piles) {
            hours += (p + k - 1) / k; // ceiling division
        }
        return hours;
    }
}
