import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class Programs {
	public static List<String> solution(List<String> programs, int offset) {
        List<String> res = new ArrayList<>();
        Map<String, Double> map = new HashMap<>();
        if (programs.size() == 0)
            return res;
        for (String prg: programs){
            map.put(prg, getPrice(prg, offset));
        }
        Stream<Map.Entry<String, Double>> sorted =
        	    map.entrySet().stream()
        	       .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()));
        Set<String> set = map.keySet();
        res = new ArrayList<>(set);
        if (res.size() == 1)
        	return res;
        return res.subList(0, 2);
        	
    }
    
    private static double getPrice(String code, int offset){
        if (code.equals("s1")){
            if (offset > 500){
                return offset * 1.25;
            }
            else
                return offset * 1;
        }
        else if(code.equals("s2")){
            if (offset > 300){
                return 300 * 1.5 + (offset - 300) * 0.5;
            }
            else
                return offset * 1.5;
        }
        else if(code.equals("b1")){
            return 0.8 * offset;
        }
        else if(code.equals("h1")){
            return 100 + 0.5 * offset;
        }
        else if(code.equals("h2")){
            double remainder = offset % 10;
            int bundles = offset / 10;
            if (remainder > 0)
                bundles += 1;
            return bundles * 9.9;
        }
        return 0;
    }
    
    public static void main(String[] args) {
    	List<String> list = new ArrayList<>();
    	list.add("s1");
    	list.add("s2");
    	System.out.println(solution(list, 750));
    }
}
