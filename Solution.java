import java.util.HashMap;
import java.util.Map;

class Solution {
    /**
     * @param s
     * @return
     */
    public static char mostFrequentChar(String s) {
      //create hash-map to store char duplicates
      final Map<Character, Integer> map = new HashMap<Character, Integer>();
      int count = 0;
      char sum = 0;
      //loop through the given string 
      for (int i = 0; i < s.length(); i ++) {
      //store character in map and add duplicates 
      char c = s.charAt(i);
      map.put(c, map.getOrDefault(c, 0)+1);
      if (count < map.get(c)) {
        sum = c;
        count = map.get(c);
      }
      }
      System.out.println(sum+": "+count);
      return sum;
    }
  
    public static void main(String[] args) {
      // Try out your test cases:
      System.out.println(Solution.mostFrequentChar("bookeeper")); // -> 'e'
    }

  }
