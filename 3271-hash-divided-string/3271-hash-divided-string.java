class Solution {
    public String stringHash(String s, int k) {
        List<String> list=new ArrayList<>();
        for(int i=0;i<=s.length()-k;i+=k){
            list.add(s.substring(i,i+k));
        }
        StringBuilder sb=new StringBuilder();
        for(String S:list){
            int cal=0;
            for(char ch:S.toCharArray()){
              cal+=ch-'a';
            }
            sb.append((char)((cal%26)+'a'));
        }
        return sb.toString();
        }
               }