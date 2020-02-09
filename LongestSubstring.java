/**
 * @id 3
 * @author ranley
 * @level middle
 * @runtime 2ms faster than 99.88%
 */
public class LongestSubstring {
	public int lengthOfLongestSubstring(String s) {
//      HashMap <Character, Integer> map = new HashMap<>();
//      int max = 0;
     
//      for (int start = 0, end = 0; end < s.length(); end++){
//          if(map.containsKey(s.charAt(end))){
//              start = Math.max(start, map.get(s.charAt(end)) + 1);
//          }
//          // update the current char index
//          map.put(s.charAt(end), end);
//          max = Math.max(max, end - start + 1);
//      }
//      return max;
     int[] index = new int[128];
     int max = 0;
     
     for (int start = 0, end = 0; end < s.length(); end++){
         start = Math.max(start, index[s.charAt(end)]);
         index[s.charAt(end)] = end + 1;
         max = Math.max(max, end - start + 1);
     }
     return max;
 }
}
