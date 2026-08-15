class Solution {
    public int countAsterisks(String s) {
        int count=0;
        int oe=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='|')
            oe++;
            if(oe%2==0){
                if(ch=='*')
                count++;
            }
        }
        return count;
    }
}