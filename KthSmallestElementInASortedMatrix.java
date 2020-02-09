import java.util.PriorityQueue;

/**
 * @id 378
 * @author ranley
 * @level middle
 * @runtime 0ms faster than 100%
 */
public class KthSmallestElementInASortedMatrix {
	// method 1: use priority queue
//	public int kthSmallest(int[][] matrix, int k) {
//        PriorityQueue<Integer> queue = new PriorityQueue<>();
//        int size = matrix.length * matrix[0].length;
//        for(int i = 0; i < matrix.length; i++){
//            for(int j = 0; j < matrix[0].length; j++){
//                queue.offer(matrix[i][j]);
//            }
//        }                
//        for(int i = 1; i < k; i++){
//            queue.poll();
//        }
//        return queue.peek();
//    }
	
	// method 2: binary search
	public int kthSmallest(int[][] matrix, int k) {
        int last_row = matrix.length - 1;
        int last_col = matrix[0].length - 1;
        int left = matrix[0][0];
        int right = matrix[last_row][last_col];
        int counter = 0;
        while(left != right){
            int mid = (left + right) / 2;
            counter = counter(matrix, mid);
            if(counter >= k)
                right = mid;
            else
                left = mid + 1;
        }
        return left;
    }
	
	// searching algorithm after optimisation
	private int counter(int[][] matrix, int mid){
        int i = matrix.length - 1;
        int j = 0;
        int counter = 0;
        
        while(i >= 0 && j < matrix[0].length){
            if(matrix[i][j] <= mid){
                counter += i + 1;
                j++;
            }
            else 
                i--;
        }
        return counter;
    }
//    private int counter(int[][] matrix, int mid){
//        int last_col = matrix[0].length - 1;
//        int counter = 0;
//        OUTER:
//        for(int i = 0; i < matrix.length; i++){
//            if(matrix[i][last_col] <= mid){
//                counter += last_col + 1;
//                continue;
//            }
//            else{
//                if(matrix[i][0] > mid)
//                    break OUTER;
//                for(int j = 0; j < last_col + 1; j++){
//                    if(matrix[i][j] <= mid)
//                        counter++;
//                    else
//                        break;
//                }
//            }
//        }
//        return counter;
//    }
}
