
/**
 * @id 79
 * @author ranley
 * @level middle
 * @runtime 3ms faster than 99.9%
 */
public class WordSearch {
	public boolean exist(char[][] board, String word) {
        if (board == null || board.length == 0 || board[0].length == 0
        || word == null || word.length() == 0) return true;
        char[] arr = word.toCharArray();
        int rows = board.length;
        int cols = board[0].length;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                // search board, start with word first character 
                if (board[r][c] == arr[0]) {
                    if (backtrack(board, arr, 0, r, c)) 
                        return true;
                }
            }
        }
        return false;
    }
        
    private boolean backtrack(char[][] board, char[] arr, int index, int i, int j){
        if(index == arr.length){
            return true;
        }
        
        if(i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] != arr[index])
            return false;
        if(board[i][j] == '*'){
            return false;
        }

        board[i][j] = '*';
        boolean res = backtrack(board, arr, index + 1, i - 1, j) ||
            backtrack(board, arr, index + 1, i + 1, j) || 
            backtrack(board, arr, index + 1, i, j - 1) ||
            backtrack(board, arr, index + 1, i, j + 1);
        board[i][j] = arr[index];
        return res;
    }
}
