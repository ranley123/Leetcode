/**
 * 
 * @author ranley
 * @id: 717
 * @runtime: 0ms faster than 100%
 */
public class OneBitAndTwoBitCharacters {
	public boolean isOneBitCharacter(int[] bits) {
        if(bits.length == 1) return true;
        if(bits.length == 2)
            return bits[0] == 0;
        int i = 0;
        for(i = 0; i < bits.length - 1; i++){
            if(bits[i] == 1)
                i++;
        }
        return i == bits.length - 1;
    }
}
