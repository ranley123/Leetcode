import java.util.HashMap;
/**
 * @id 904
 * @author ranley
 * @level middle
 * @runtime 4ms faster than 100%
 */
public class FruitIntoBaskets {
	// method 1: use HashMap
//	public int totalFruit(int[] trees) {
//        if(trees.length == 1)
//            return 1;
//        int max = 0;
//        HashMap<Integer, Integer> map = new HashMap<>();
//        int left = 0;
//        int right = 0;
//        
//        while(right < trees.length){
//            map.put(trees[right], map.getOrDefault(trees[right], 0) + 1);
//            while(map.size() > 2){
//                map.put(trees[left], map.get(trees[left]) - 1);
//                if(map.get(trees[left]) == 0)
//                    map.remove(trees[left]);
//                left++;
//            }
//            max = Math.max(max, right - left + 1);
//            right++;
//        }
//        return max;
//    }
	
	public int totalFruit(int[] trees){
        int left = 0;
        int right = 0;
        int max = 0;
        
        for(int i = 1; i < trees.length; i++){
            if(trees[i] == trees[left] || trees[i] == trees[right])
                continue;
            max = Math.max(max, i - left);
            left = i - 1;
            
            // the most import part
            while(left > 0 && trees[left - 1] == trees[left])
                left--;
            right = i;
        }
        max = Math.max(max, trees.length - left);
        return max;
    }
}
