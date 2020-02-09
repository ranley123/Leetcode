import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * 
 * @author ranley
 * @id: 989
 * @runtime: 6ms faster than 99%
 */
public class AddToArrayForm {
	public List<Integer> addToArrayForm(int[] A, int K) {
        int n = K;
        int index = A.length - 1;
        int carry = 0;
        List<Integer> list = new ArrayList<>();
        
        while(index >= 0 || n != 0){
            int remainder = n % 10;
            int sum = 0;
            if(index >= 0){
                sum = A[index] + remainder + carry;
                index--;
            }
            else{
                sum = remainder + carry;
            }
            
            list.add(sum % 10);
            carry = sum / 10;
            n = n / 10;
        }
        if(carry == 1) list.add(carry);
        Collections.reverse(list);
        return list;
    }
}
