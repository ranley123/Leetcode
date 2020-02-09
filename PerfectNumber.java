/**
 * id: 507
 * runtime: 5ms faster than 99.7%
 * @author ranley
 *
 */
public class PerfectNumber {
	public boolean checkPerfectNumber(int num) {
        if(num == 0) return false;
            
        int res = 0;
        
        for(int i = 1; i * i < num; i++){
            if(num % i == 0){
                res += i;
                if(i != 1) res += (int)(num/i);
            }
        }
        return res == num;
    }
}
