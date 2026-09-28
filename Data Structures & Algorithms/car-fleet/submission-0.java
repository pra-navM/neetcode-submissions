

class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        if (n == 0) return 0;
        
        // Create array of car indices and sort by position in descending order
        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) indices[i] = i;
        Arrays.sort(indices, Comparator.comparingInt(i -> -position[i]));
        
        int fleets = 0;
        double maxTime = -1;
        
        for (int i : indices) {
            double time = (double)(target - position[i]) / speed[i];
            if (time > maxTime) { // New fleet formed
                fleets++;
                maxTime = time;
            }
        }
        return fleets;
    }
}
