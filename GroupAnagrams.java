import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/**
 * @id 49
 * @author ranley
 * @level middle
 * @runtime 8ms faster than 97%
 */
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        // use array to save, slow
//         List<List<String>> res = new ArrayList<>();
//         HashMap<String, List<String>> map = new HashMap<>();
        
//         for(int i = 0; i < strs.length; i++){
//             int[] alp = new int[26];
//             char[] arr = strs[i].toCharArray();
//             for(int j = 0; j < arr.length; j++){
//                 alp[arr[j] - 'a'] += 1;
//             }
//             String temp = Arrays.toString(alp);
//             if(!map.containsKey(temp)){
//                 map.put(temp, new ArrayList<String>());
//             }
//             map.get(temp).add(strs[i]);
//             // System.out.println(alp);
//         }
//         res = new ArrayList<List<String>>(map.values());
//         return res;
        HashMap<String, List<String>> map = new HashMap<>();
        
        for(int i  = 0; i < strs.length; i++){
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String temp = String.valueOf(arr);
            
            if(!map.containsKey(temp)){
                map.put(temp, new ArrayList<String>());
            }
            map.get(temp).add(strs[i]);
        }
        return new ArrayList<List<String>>(map.values());
    }
}
