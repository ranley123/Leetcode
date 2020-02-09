/**
 * id: 896
 * runtime: 10ms faster than 100%
 * @author ranley
 *
 */
public class MonotonicArray {
	public boolean isMonotonic(int[] A) {
        boolean increasing = false;
        int initial = -1;
        
        for(int i = 1; i < A.length; i++){
            if(A[i] == A[i - 1]) continue;
                
            if(initial == -1){
                if(A[i] > A[i - 1]){
                    increasing = true;
                }
                initial = 0;
            }
            else{
                if(A[i] > A[i - 1] && increasing) continue;
                if(A[i] < A[i - 1] && (!increasing)) continue;
                return false;
            }
        }
        return true;
    }
}
