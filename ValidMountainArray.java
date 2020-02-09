/**
 * 
 * @author ranley
 * @id: 941
 * @runtime: 4ms faster than 98.5%
 */
public class ValidMountainArray {
	public boolean validMountainArray(int[] A) {
        if(A.length < 3) return false;
        //since it is for mountain, the initial trend should be 1
        int trend = 1; // 0 for descending, 1 for ascending
        int change = 0; // change times
        if(A[1] <= A[0]) return false;
        
        for(int i = 2; i < A.length; i++){
            int temp = 0;
            if(A[i] > A[i-1]) temp = 1;
            else if(A[i] < A[i-1]) temp = 0;
            else return false;
            if(temp != trend){
                if(change == 1) return false;
                change++;
                trend = temp;
            }
        }
        return change != 0;
    }
}
