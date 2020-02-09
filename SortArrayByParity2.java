/*
 * id: 922
 * runtime@ 4ms faster than 100%
 */
public class SortArrayByParity2 {
	public static int[] sortArrayByParityII(int[] A) {
		if(A.length <= 1){
            return A;
        }
        
        int odd = 1;
        for (int even = 0; even < A.length; even += 2){
            // when it is odd in the even position
            if((A[even] & 1) != 0){
                //when the odd number is correct
                while((A[odd] & 1) == 1) odd += 2;
                int temp = A[even];
                A[even] = A[odd];
                A[odd] = temp;
            }
        }
        return A;
            
    }
            
    
    
    public static void main(String[] args) {
    	int[] a = {2,3,1,1,4,0,0,4,3,3};
    	a = sortArrayByParityII(a);
    	for(int n: a) {
    		System.out.print(n);
    		
    	}
    }
}
