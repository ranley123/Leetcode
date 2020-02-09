import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author ranley
 * @id: 1018
 * @runtime: 3ms faster than 98%
 */
public class BinaryPrefixDivBy5 {
	public List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> list = new ArrayList<>();
        int remainder = 0;
        for (int a : A) {
            remainder = ((remainder << 1) + a) % 5;
            list.add(remainder == 0);
        }
        return list;
    }
}
