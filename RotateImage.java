/**
 * @id 48
 * @author ranley
 * @level middle
 * @runtime 0ms faster than 100%
 */
public class RotateImage {
	public void rotate(int[][] matrix) {
        // the column number becomes the row number 
        // the row number + new column number = length - 1
        int len = matrix.length;
        for(int i = 0; i < len - 1; i++){
            for(int j = i; j < len - i - 1; j++){
                rotateRound(matrix, len - 1, i, j, matrix[i][j], 4);
            }
        }
    }
    
    private void rotateRound(int[][] matrix, int curlen, int i, int j, int value, int counter){
        if(counter == 0)
            return;
        int target_i = j;
        int target_j = curlen - i;
        
        int temp = matrix[target_i][target_j];
        matrix[target_i][target_j] = value;
        counter--;
        rotateRound(matrix, curlen, target_i, target_j, temp, counter);
    }
    
    // we can also notice that if we want to get its transpose
    // firstly, flip against the matrix's diagonal
    // secondly, flip horizontally
}
