/**
 * @id 12
 * @author ranley
 * @level middle
 * @runtime 3ms faster than 100%
 */
public class IntegerToRoman {
	public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        String[] symbols = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] value = {1000,900,500,400, 100, 90,  50, 40,  10, 9,   5,  4,   1}; 
        int i = 0;
        while(num != 0){
            while(num >= value[i]){
                num -= value[i];
                sb.append(symbols[i]);
            }
            i++;
        }
        return sb.toString();
    }
}
