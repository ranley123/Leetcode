/**
 * @id 191
 * @author ranley
 * @level middle
 * @runtime 0ms faster than 100%
 */
public class NumberOf1Bits {
    public int hammingWeight(int n) {
        int counter = 0;
        while(n != 0){
            if((n & 1) == 1)
                counter++;
            n >>>= 1;
        }
        return counter;
    }
}
