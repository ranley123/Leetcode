/*
 * id: 985
 * runtime: 7ms faster than 98.4%
 */
public class SumOfEvenNumbers {
	public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int[] res = new int[queries.length];
        int sum = 0;
        for(int num: A){
            if(num % 2 == 0) sum += num;
        }
        
        for(int i = 0; i < queries.length; i++){
            int index = queries[i][1];
            if(A[index] % 2 == 0){
                sum -= A[index];
            }
            A[index] += queries[i][0];
            if(A[index] % 2 == 0){
                sum += A[index];
            }
            res[i] = sum;
        }
        return res;
    }
}
