import java.util.ArrayList;
import java.util.List;

/**
 * @id 240
 * @author ranley
 * @level middle
 * @runtime 5ms faster than 100%
 */
public class SearchA2DMatrix2 {
	// method 1
//    public boolean searchMatrix(int[][] matrix, int target) {
//        List<Integer> rowRange = new ArrayList<>();
//        List<Integer> colRange = new ArrayList<>();
//        if(matrix.length == 0)
//            return false;
//        
//        for(int i = 0; i < matrix.length; i++)
//            rowRange.add(i);
//        for(int i = 0; i < matrix[0].length; i++)
//            colRange.add(i);
//                
//        while(rowRange.size() > 0 && colRange.size() > 0){
//            if(rowRange.size() == 1 && colRange.size() == 1 && matrix[rowRange.get(0)][colRange.get(0)] == target)
//                return true;
//            
//            int firstCol = colRange.get(0);
//            int lastCol = colRange.get(colRange.size() - 1);
//            for(int i = 0; i < rowRange.size(); i++){
//                int row = rowRange.get(i);
//                if(!(matrix[row][firstCol] <= target && matrix[row][lastCol] >= target)){
//                    rowRange.remove(i);
//                    i--;
//                }
//                else if(matrix[row][firstCol] == target || matrix[row][lastCol] == target)
//                    return true;
//            }
//            if(rowRange.size() == 0)
//                return false;
//            int firstRow = rowRange.get(0);
//            int lastRow = rowRange.get(rowRange.size() - 1);
//            for(int i = 0; i < colRange.size(); i++){
//                int col = colRange.get(i);
//                if(!(matrix[firstRow][col] <= target && matrix[lastRow][col] >= target)){
//                    colRange.remove(i);
//                    i--;
//                }
//                else if(matrix[firstRow][col] == target && matrix[lastRow][col] == target)
//                    return true;
//            }
//            
//        }
//        return false;
//    }
	
	public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0)
            return false;
        return helper(matrix, matrix.length - 1, 0, target);
    }
    
    private boolean helper(int[][] matrix, int i, int j, int target){
        int rows = matrix.length;
        int cols = matrix[0].length;
        if(!(i >= 0 && i < rows && j >= 0 && j < cols))
            return false;
        if(matrix[i][j] == target)
            return true;
        else if(matrix[i][j] < target)
            return helper(matrix, i, j + 1, target);
        else 
            return helper(matrix, i - 1, j, target);
    }
}
