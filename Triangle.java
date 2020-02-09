import java.util.List;

/**
 * @id 120
 * @author ranley
 * @level middle
 * @runtime 0ms faster than 100%
 */
public class Triangle {
	public int minimumTotal(List<List<Integer>> triangle) {
        int size = triangle.size();
        if(size == 0)
            return 0;
        List<Integer> sum = triangle.get(size - 1);
        for(int i = size - 2; i >= 0; i--){
            List<Integer> list = triangle.get(i);
            int listSize = list.size();
            for(int j = 0; j < listSize; j++){
                sum.set(j, Math.min(sum.get(j), sum.get(j + 1)) + list.get(j));
            }
        }
        return sum.get(0);
    }
}
