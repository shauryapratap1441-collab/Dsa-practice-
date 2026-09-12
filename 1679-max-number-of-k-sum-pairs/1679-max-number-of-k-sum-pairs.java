import java.util.*;

class Solution {
    public int maxOperations(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        
        for (int num : nums) {
            int target = k - num;
            
            // 1. Check if the complement is ALREADY available to be paired up
            if (map.containsKey(target) && map.get(target) > 0) {
                count++;
                // Consume one instance of the target
                map.put(target, map.get(target) - 1);
            } else {
                // 2. If no pair can be formed yet, store the current number for future pairs
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }
        
        return count;
    }
}
