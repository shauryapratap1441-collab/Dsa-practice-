import java.util.Arrays;

class Solution {
    public String largestNumber(int[] nums) {
        // Step 1: Convert integers to Strings
        String[] strNums = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strNums[i] = String.valueOf(nums[i]);
        }
        
        // Step 2: Sort strings using a custom comparator
        Arrays.sort(strNums, (a, b) -> {
            String order1 = b + a;
            String order2 = a + b;
            return order1.compareTo(order2); 
        });
        
        // Step 3: Handle the edge case where the largest number is "0"
        if (strNums[0].equals("0")) {
            return "0";
        }
        
        // Step 4: Concatenate the sorted elements
        StringBuilder largestNumStr = new StringBuilder();
        for (String numStr : strNums) {
            largestNumStr.append(numStr);
        }
        
        return largestNumStr.toString();
    }
}
