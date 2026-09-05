class Solution {
    public int search(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if (nums[mid] == target) {
                return mid;
            }
            
            // Step 1: Check if the left half is sorted
            if (nums[start] <= nums[mid]) {
                // Step 2: Check if target is within the sorted left half
                if (target >= nums[start] && target < nums[mid]) {
                    end = mid - 1; // Search left
                } else {
                    start = mid + 1; // Search right
                }
            } 
            // Step 1 Alt: Otherwise, the right half must be sorted
            else {
                // Step 2: Check if target is within the sorted right half
                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1; // Search right
                } else {
                    end = mid - 1; // Search left
                }
            }
        }
        
        return -1; 
    }
}
