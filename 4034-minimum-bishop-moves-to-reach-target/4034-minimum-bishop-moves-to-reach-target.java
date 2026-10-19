class Solution {
    public int minBishopMoves(int[] source, int[] target) {
      int s1=source[0]+source[1];
      int s2=target[0]+target[1];
      if(s1%2==0&&s2%2!=0||s1%2!=0&&s2%2==0) return -1;
      int s3=(source[0]-source[1]),s4=(target[0]-target[1]);
      if(s1==s2||s3==s4) return 1;
      return 2;
    }
}