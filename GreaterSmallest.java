/*
 * id: 744
 * runtime: 9ms faster than 98.5%
 */
public class GreaterSmallest {
	public char nextGreatestLetter(char[] letters, char target) {
        //normal way
        /*
        if(target >= letters[letters.length - 1]) return letters[0];
        if(target < letters[0]) return letters[0];
        
        int low = 0;
        int high = letters.length - 1;
        
        while(low < high){
            int middle = (low + high)/2;
            if (letters[middle] > target) high = middle;
            //make sure that at the end the low is bigger than the original
            else low = middle + 1;
        }
        
        return letters[low];
        */
        
        int low = 0;
        int high = letters.length - 1;
        
        while(low < high){
            int middle = (low + high)/2;
            if (letters[middle] > target) high = middle;
            //make sure that at the end the low is bigger than the original
            else low = middle + 1;
        }
        if (letters[low] <= target) low++;
            
        
        return letters[low % (letters.length)];

    }
	
	
}
