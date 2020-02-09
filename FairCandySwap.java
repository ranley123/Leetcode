import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @author ranley
 * @id: 888
 * @runtime: 14ms faster than 95%
 */
public class FairCandySwap {
	public static int[] fairCandySwap(int[] A, int[] B) {
		int sa = 0, sb = 0;
	    Set<Integer> S = new HashSet<>();
	    for (int n : A){  
            sa += n; 
            S.add(n);
        }
	    for (int n : B) 
            sb += n; 
	    int d = (sa - sb) / 2;
	    for (int n : B) if (S.contains(n + d)) return new int[]{n + d, n};
	    return null;
	}
	
	public static void main(String [] args) {
		int[] A = {35,17,4,24,10};
		int[] B = {63, 21};
		for(int i: fairCandySwap(A, B)) {
			
			System.out.println(i);
		}
	}
}
