class Solution {
    public int[] twoSum(int[] nums, int target) {
        int q[]=new int[2];
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int k=target-nums[i];
            if(map.containsKey(k)){
                q[0]=i;
                q[1]=map.get(k);
                return q;
            }
            map.put(nums[i],i);
        }
        return q;
    }
}