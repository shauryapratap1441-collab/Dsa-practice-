class Solution {
    public int differenceOfSum(int[] nums) {
        int esum=0,dsum=0;
        for(int num:nums){
            esum+=num;
                while(num>0){
                    dsum+=num%10;
                    num/=10;
                }
        }
        return Math.abs(esum-dsum);
    }
}