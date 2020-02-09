/*
 * id: 905
 * runtime: 15ms faster than 97%
 */
public class SortArray {
public int[] sortArrayByParity(int[] A) {
        
        //method 1
        /*
        int len = A.length;
        int[] res = new int[len];
        int low = 0; 
        int high = len - 1;
        
        for(int i = 0; i < len; i++){
            if(A[i]%2 == 0) res[low++] = A[i];
            else res[high--] = A[i];
        }
        return res;*/
        
        //method 2: in-place
        int i = 0, j = A.length - 1;
        while (i < j) {
            if (A[i] % 2 > A[j] % 2) {
                int tmp = A[i];
                A[i] = A[j];
                A[j] = tmp;
            }

            if (A[i] % 2 == 0) i++;
            if (A[j] % 2 == 1) j--;
        }

        return A;
    }
}
