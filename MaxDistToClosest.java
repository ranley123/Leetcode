/**
 * 
 * @author ranley
 * @id: 849
 * @runtime: 2ms faster than 99%
 */
public class MaxDistToClosest {
	public int maxDistToClosest(int[] seats) {
        int firstPerson = 0;
        if(seats[0] == 0) firstPerson = -1;
        int counter = 0;
        int max = 0;
        
        for(int i = 0; i < seats.length; i++){
            if(seats[i] == 0) counter++;
            else{
                if(firstPerson == -1) 
                    max = counter;
                else
                    max = Math.max(max, (counter + 1)/2);
                counter = 0;
                firstPerson = i;
            }
        }
        max = Math.max(max, counter);
        return max;
    }
}
