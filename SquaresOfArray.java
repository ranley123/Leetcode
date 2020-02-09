/*
 * id: 977
 * runtime: 6ms faster than 100%
 */
public class SquaresOfArray {
	public int[] sortedSquares(int[] A) {
        /*for(int i = 0; i < A.length; i++){
            A[i] = A[i] * A[i];
        }
        Arrays.sort(A);
        return A;*/
        
        //method 2: notice that the array A is already sorted
        int[] res = new int[A.length];
        int low = 0;
        int high = A.length - 1;
        int index = A.length - 1;
        
        while(index >= 0){
            if (A[low] * A[low] < A[high] * A[high]){
                res[index] = A[high] * A[high];
                index--;
                high--;
            }
            else{
                res[index] = A[low] * A[low];
                index--;
                low++;
            }
        }
        return res;
        
    }
}
