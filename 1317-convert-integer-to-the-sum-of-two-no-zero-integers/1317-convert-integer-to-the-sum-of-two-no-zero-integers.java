class Solution {
    public int[] getNoZeroIntegers(int n) {
        int arr[] = new int[2];
        
        for (int i = 1; i < n; i++) {
            boolean flag = true;
            int a = i, b = n - i;
            
            // Check if 'a' contains any zeros
            while (a > 0) {
                if (a % 10 == 0) {
                    flag = false;
                    break; // Stop checking 'a' immediately if a zero is found
                }
                a /= 10;
            }
            
            // Only check 'b' if 'a' is already verified as safe
            if (flag) {
                while (b > 0) {
                    if (b % 10 == 0) {
                        flag = false;
                        break; // Stop checking 'b' immediately if a zero is found
                    }
                    b /= 10;
                }
            }
            
            // If both numbers are valid (no zeros found), return immediately
            if (flag) {
                arr[0] = i;
                arr[1] = n - i;
                return arr; // Direct return is cleaner than break
            }
        }
        return arr;
    }
}
