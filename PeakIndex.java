/*
 * id: 852
 * runtime: 2ms faster than 99.5%
 */
public class PeakIndex {
	public int peakIndexInMountainArray(int[] A) {
        if(A.length == 1) return A[0];
        int low = 0;
        int high = A.length - 1;
        
        while(low < high){
            int middle = (low + high)/2;
            if(A[middle] < A[middle + 1]){
                low = middle + 1;
            }
            else{
                high = middle;
            }
        }
        return low;
    }
}
