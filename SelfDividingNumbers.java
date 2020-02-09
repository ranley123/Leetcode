import java.util.ArrayList;
import java.util.List;
/*
 * id: 728
 * runtime: 3ms faster than 99%
 */
public class SelfDividingNumbers {
	public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        
        for(int i = left; i <= right; i++){
            if(isSelf(i)) list.add(i);
        }
        return list; 
    }
    
    public boolean isSelf(int num){
        int i = num;
        while(num > 9){
            int reminder = num % 10;
            if(reminder == 0 || (i % reminder) != 0) {
               return false;
            }    
            num = num / 10;
        }
        if(i % num != 0){
            return false;
        }
        return true;
    }
}
