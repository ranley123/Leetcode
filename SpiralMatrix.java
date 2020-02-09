import java.util.ArrayList;
import java.util.List;

/**
 * @id 54
 * @author ranley
 * @level middle
 * @runtime 0ms faster than 100%
 */
public class SpiralMatrix {
	public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if(matrix.length == 0)
            return res;
        int[] dr = {0, 1, 0, -1}; // direction row
        int[] dc = {1, 0, -1, 0}; // direction col
        int side = 0; // current side
        int cr = 0; // current row
        int cc = 0; // current col
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean[][] seen = new boolean[rows][cols];
        
        for(int i = 0; i < rows * cols; i++){
            seen[cr][cc] = true;
            res.add(matrix[cr][cc]);
            
            int tempR = cr + dr[side];
            int tempC = cc + dc[side];
            if((tempR < 0 || tempR >= matrix.length || tempC < 0 || tempC >= matrix[0].length))
                side = (side + 1) % 4;
            else if(seen[tempR][tempC])
                side = (side + 1) % 4;
            cr += dr[side];
            cc += dc[side];
        }
        return res;
    }
}
