import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        // Step 1: Populate the map for O(1) lookups
        Map<String, String> map = new HashMap<>();
        for (List<String> pair : knowledge) {
            map.put(pair.get(0), pair.get(1));
        }
        
        StringBuilder res = new StringBuilder();
        StringBuilder key = new StringBuilder();
        boolean inBracket = false;
        
        // Step 2: Parse the string in a single pass
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c == '(') {
                inBracket = true;
            } else if (c == ')') {
                inBracket = false;
                // Look up the accumulated key, default to "?" if not found
                res.append(map.getOrDefault(key.toString(), "?"));
                key.setLength(0); // Reset key buffer
            } else {
                if (inBracket) {
                    key.append(c); // Accumulate key inside brackets
                } else {
                    res.append(c); // Append regular characters directly
                }
            }
        }
        
        return res.toString();
    }
}
