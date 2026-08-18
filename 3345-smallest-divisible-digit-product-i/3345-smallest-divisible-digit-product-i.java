class Solution {
    public int smallestNumber(int n, int t) {  
        int k=n;
        int pro=1;
      while(k>0){
        pro*=k%10;
        k/=10;
      }
      if(pro%t==0)
      return n;
      while(pro%t!=0){
        pro=1;
        int l=++n;
        while(l>0){
            pro*=l%10;
            l/=10;
        }
      }
      return n;
        
    }
}