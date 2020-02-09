/**
 * @id 130
 * @author ranley
 * @level middle
 * @runtime 1ms faster than 100%
 */
public class SurroundedRegions {
	public void solve(char[][] board) {
        if(board.length == 0)
            return;
        for(int j = 0; j < board[0].length; j++){
            if(board[0][j] == 'O')
                markConnected(board, 0, j);
            if(board[board.length - 1][j] == 'O')
                markConnected(board, board.length - 1, j);
        }
        
        for(int i = 1; i < board.length - 1; i++){
            if(board[i][0] == 'O')
                markConnected(board, i, 0);
            if(board[i][board[0].length - 1] == 'O')
                markConnected(board, i, board[0].length - 1);
        }
        
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == '-')
                    board[i][j] = 'O';
                else
                    board[i][j] = 'X';
            }
        }
    }
    
    private void markConnected(char[][] board, int i, int j){
        if(!(i >= 0 && i < board.length && j >= 0 && j < board[0].length))
            return;
        if(board[i][j] != 'O')
            return;
        board[i][j] = '-';
        markConnected(board, i - 1, j);
        markConnected(board, i + 1, j);
        markConnected(board, i, j - 1);
        markConnected(board, i, j + 1);
    }
}
