class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if (timeSeries == null || timeSeries.length == 0) {
            return 0;
        }
        
        int totalDuration = 0;
        
        // Loop through all attacks except the last one
        for (int i = 0; i < timeSeries.length - 1; i++) {
            // Add the smaller value: either the actual gap or the full duration
            totalDuration += Math.min(duration, timeSeries[i + 1] - timeSeries[i]);
        }
        
        // The last attack always runs for the full duration
        totalDuration += duration;
        
        return totalDuration;
    }
}
