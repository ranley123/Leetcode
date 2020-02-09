/**
 * @id 73
 * @author ranley
 * @level middle
 * @runtime 1ms faster than 100%
 */
public class SetMatrixZeros {
	// approach 1: using additional memory space to store indices
	//  public void setZeroes(int[][] matrix) {
	//      Set<Integer> row = new HashSet<>();
	//      Set<Integer> col = new HashSet<>();

	//      for(int i = 0; i < matrix.length; i++){
	//          for(int j = 0; j < matrix[0].length; j++){
	//              if(matrix[i][j] == 0){
	//                  row.add(i);
	//                  col.add(j);
	//              }
	//          }
	//      }

	//      for(int i = 0; i < matrix.length; i++){
	//          for(int j = 0; j < matrix[0].length; j++){
	//              if(row.contains(i) || col.contains(j)){
	//                  matrix[i][j] = 0;
	//              }
	//          }
	//      }
	//  }
	public void setZeroes(int[][] matrix) {
		boolean zero_row = false, zero_col = false;

		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[0].length; j++){
				if(matrix[i][j] == 0){
					if(i == 0 || j == 0){
						if(i == 0)
							zero_row = true;
						if(j == 0)
							zero_col = true;
					}
					else{
						matrix[i][0] = 0;
						matrix[0][j] = 0;
					}
				}
			}
		}


		for(int i = 1; i < matrix.length; i++){
			for(int j = 1; j < matrix[0].length; j++){
				if(matrix[i][0] == 0 || matrix[0][j] == 0){
					matrix[i][j] = 0;
				}
			}
		}

		// for the first row and column
		if(zero_row)
			for(int j = 0; j < matrix[0].length; j++)
				matrix[0][j] = 0;
		if(zero_col)
			for(int i = 0; i < matrix.length; i++)
				matrix[i][0] = 0;
	}
}
