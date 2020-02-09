import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

/**
 * @id 454
 * @author ranley
 * @level middle
 * @runtime 56ms faster than 99.43%
 */
public class FourSum2 {
	public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer, Integer> map = new HashMap<>();
        int counter = 0;
        for(int a: A){
            for(int b: B){
                map.merge(a + b, 1, (BiFunction<? super Integer, ? super Integer, ? extends Integer>) new BiFunction<Integer, Integer, Integer>(){
                    public Integer apply(Integer t, Integer u){
                        return t + u;
                    }
                });
            }
        }
        for(int c: C){
            for(int d: D){
                counter += map.getOrDefault(-c-d, 0);
            }
        }
        return counter;
    }
}
