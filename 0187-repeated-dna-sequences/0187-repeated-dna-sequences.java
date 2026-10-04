class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
            List<String> list=new ArrayList<>();
            if(s.length()<10) return list;
            Map<String,Integer> map=new HashMap<>();
            for(int i=0;i<=s.length()-10;i++){
                String set=s.substring(i,i+10);
                map.put(set,map.getOrDefault(set,0)+1);
            }
            for(Map.Entry<String,Integer> entry : map.entrySet()){
                if(entry.getValue()>1)
                list.add(entry.getKey());
            }    
            return list;
    }
}