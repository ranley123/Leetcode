import java.util.ArrayList;
import java.util.List;

/**
 * @id: 118
 * @runtime: 0ms faster than 100%
 * @author ranley
 *
 */
public class PascalTriangle {
	public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> row = new ArrayList<>();
        List<Integer> lastRow = new ArrayList<>();
        if(numRows == 0) return res;
        row.add(1);
        lastRow.add(1);
        res.add(row);
        
        if(numRows == 1){
            return res;
        }
        for(int i = 1; i < numRows; i++){
            row = new ArrayList<>();
            for(int j = 0; j < i + 1; j++){
                if(j == 0 || j == i){
                    row.add(1);
                }
                else{
                    row.add((lastRow.get(j - 1) + lastRow.get(j)));
                }
            }
            res.add(row);
            lastRow = row;
        }
        return res;
    }}
