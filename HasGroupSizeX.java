import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 
 * @author ranley
 * @id: 914
 * @runtime: 9ms faster than 74%
 */
public class HasGroupSizeX {
	public static boolean hasGroupsSizeX(int[] deck) {
        if(deck.length < 2) return false;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i: deck){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        Iterator it = map.entrySet().iterator();
        int X = 0;
        int min = deck.length;
        
        while(it.hasNext()){
            Map.Entry pair = (Map.Entry)it.next();
            int times = (int)pair.getValue();
            if(times < min) min = times;
        }
        
        int flag = 0;
        for(int i = 2; i <= min; i++){
        	it = map.entrySet().iterator();
            while(it.hasNext()){
                Map.Entry pair = (Map.Entry)it.next();
                int times = (int)pair.getValue();
                if(times % i == 0) {
                	flag = 1;
                }
                else {
                	flag = 0;
                	break;
                }
            }
            if(flag == 1) return true;
        }
        //if(flag == 1) return true;
            
        return false;   
        
    }
	
	public static void main(String[] args) {
		int[] deck = {1,1,1,1,2,2,2,2,2,2};
		System.out.println(hasGroupsSizeX(deck));
	}
}
