class Solution {
    public int maxArea(int[] height) {
        int currwater=0,maxwater=0,h=0,w=0,start=0,end=height.length-1;
       while(start<end)
       {
        h=Math.min(height[start],height[end]);
        w=end-start;
        currwater=h*w;
        maxwater=Math.max(maxwater,currwater);
        if(height[end]>height[start])
        start++;
        else
        end--;
       }
        return maxwater;  
    }
}