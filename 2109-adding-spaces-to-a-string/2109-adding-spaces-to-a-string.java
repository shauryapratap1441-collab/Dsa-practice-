class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb=new StringBuilder();
        int right=0,k=0;
        while(right<s.length()){
            if(k<spaces.length){
            while(right<spaces[k]){
                sb.append(s.charAt(right++));
            }
            sb.append(' ');
            k++;
            }
            else
            sb.append(s.charAt(right++));
        }
        return sb.toString();
    }
}