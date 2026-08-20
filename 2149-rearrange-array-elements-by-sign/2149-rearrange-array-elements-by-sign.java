class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            list1.add(nums[i]);
            else
            list2.add(nums[i]);
        }
        int j=0,k=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                nums[i]=list1.get(j++);
            }
            else
            nums[i]=list2.get(k++);
        }
        return nums;
    }
}