/**
 * @id 200
 * @author ranley
 * @level middle
 * @runtime 1ms faster than 100%
 */
public class NumberOfIslands {
	int counter = 0;
	public int numIslands(char[][] grid) {
		if(grid.length == 0)
			return 0;
		for(int i = 0; i < grid.length; i++){
			for(int j = 0; j < grid[0].length; j++){
				if(grid[i][j] == '1'){
					markConnected(grid, i, j);
					counter++;
				}
			}
		}
		return counter;
	}

	private void markConnected(char[][] grid, int i, int j){
		if(!(i >= 0 && i < grid.length && j >= 0 &&  j < grid[0].length))
			return;

		if(grid[i][j] == '1')
			grid[i][j] = 'X';
		else
			return;

		markConnected(grid, i - 1, j);
		markConnected(grid, i + 1, j);
		markConnected(grid, i, j - 1);
		markConnected(grid, i, j + 1);
	}
}
