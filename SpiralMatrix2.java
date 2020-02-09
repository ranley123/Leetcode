/**
 * @id 59
 * @author ranley
 * @level middle
 * @runtime 0ms faster than 100%
 */
public class SpiralMatrix2 {
	public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int[] dr = {0, 1, 0, -1}; // direction row
        int[] dc = {1, 0, -1, 0}; // direction col
        int side = 0; // current side
        int cr = 0; // current row
        int cc = 0; // current col
        boolean[][] seen = new boolean[n][n];
        
        for(int i = 1; i <= n * n; i++){
            seen[cr][cc] = true;
            res[cr][cc] = i;
            
            int tempR = cr + dr[side];
            int tempC = cc + dc[side];
            if((tempR < 0 || tempR >= n || tempC < 0 || tempC >= n))
                side = (side + 1) % 4;
            else if(seen[tempR][tempC])
                side = (side + 1) % 4;
            cr += dr[side];
            cc += dc[side];
        }
        return res;
    }
}
