class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int num:nums){
            int dig=0;
            int k=num;
            while(k>0){
                dig++;
                k/=10;
            }
            if(dig%2==0)
            count++;
        }
        return count;
    }
}