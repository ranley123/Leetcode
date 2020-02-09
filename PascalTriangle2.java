import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author ranley
 * @id:119
 * @runtime: 1ms faster than 85%
 */
public class PascalTriangle2 {
	public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        List<Integer> lastRow = new ArrayList<>();
        row.add(1);
        lastRow.add(1);
        
        if(rowIndex == 0) return row;
       
        for(int i = 1; i <= rowIndex + 1; i++){
            row = new ArrayList<>();
            for(int j = 0; j < i; j++){
                if(j == 0 || j == i-1){
                    row.add(1);
                }
                else{
                    row.add((lastRow.get(j - 1) + lastRow.get(j)));
                }
            }
            lastRow = row;
        }
        return row;
    }
}
